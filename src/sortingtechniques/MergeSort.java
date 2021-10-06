/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-06-2021
 *   Time: 13:29
 *   File: MergeSort.java
 */

package sortingtechniques;

class Main{

    public static void main(String[] args) {
        int[] a = {5,4,9,3,2,10};
        mergeSort(a, 0, a.length-1);
    }

    public static void mergeSort(int[] array, int start, int end){
        mergeSort(array, start, (start+end)/2);
        mergeSort(array, (start+end)/2, end);
        merge(array)
    }

    public static void merge(int[] array){

    }

}