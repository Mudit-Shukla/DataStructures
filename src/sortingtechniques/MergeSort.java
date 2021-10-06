/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-06-2021
 *   Time: 13:29
 *   File: MergeSort.java
 */

package sortingtechniques;

class Main{

    static int[] array = {5,8,6,1,4,9,3};
    static int[] tempArray = new int[array.length];
    public static void main(String[] args) {

        mergeSort(array,0,array.length-1);
        for(int i =0; i< tempArray.length; i++)
            array[i] = tempArray[i];
        for(int i : array)
            System.out.println(i);

    }

}