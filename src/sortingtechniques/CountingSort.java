/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-12-2021
 *   Time: 21:52
 *   File: CountingSort.java
 */

package sortingtechniques;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 3, 1, 2, 3};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int element : array)
            System.out.print(element + " ");
        System.out.println();
        for(int element : array){
            if(min > element)
                min = element;
            if(max < element)
                max = element;
        }
        int range = max - min + 1;
        int[] count = new int[range];
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            count[array[i] - min]++;


        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];


        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        for (int i = 0; i < array.length; i++)
            array[i] = sortedArray[i];


        for(int element : array)
            System.out.print(element + " ");
    }
}
