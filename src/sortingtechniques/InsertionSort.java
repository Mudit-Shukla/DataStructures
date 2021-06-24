package sortingtechniques;
/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 25-05-2021
 *   Time: 01:24
 *   File: sortingtechniques.InsertionSort.java
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,10,6,9,4,3};

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i;
            while(j > 0 && array[j-1] > temp){
                array[j] = array[j-1];
                j = j-1;
            }
            array[j] = temp;
        }

        for(int value : array){
            System.out.println(value);
        }
    }
}
