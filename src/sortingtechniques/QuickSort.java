package sortingtechniques;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-06-2021
 *   Time: 10:24
 *   File: sortingtechniques.QuickSort.java
 */

public class QuickSort {

    static int[] array = {2,3,1,6,8,4,5};
    public static void main(String[] args) {

        quickSortFunction(0, array.length-1);
        for(int i : array)
            System.out.print(i + " ");
    }

    public static int partitioning(int left, int right){
        int pivot = array[left];
        int i = left;
        int j = right;
        while (i<j) {
            while (pivot >= array[i])
                i++;
            while (pivot < array[j])
                j--;
            if(i < j)
                swap(array, i, j);
        }
        swap(array, left, j);
        return j;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSortFunction( int left, int right){
        if(left < right) {
            int pivot = partitioning(left, right);
            quickSortFunction(left, pivot-1);
            quickSortFunction(pivot+1, right);
        }
    }
}
