/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-11-2021
 *   Time: 21:42
 *   File: BubbleSort.java
 */

package sortingtechniques;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {10, 5, 15, 7, 3, 20};

        for(int i = 0; i< array.length; i++){
            for(int j = 0; j < array.length -i - 1; j++){
                if(array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int element : array)
            System.out.print(element + " ");
    }
}
