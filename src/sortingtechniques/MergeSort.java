/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-06-2021
 *   Time: 13:29
 *   File: MergeSort.java
 */

package sortingtechniques;

class Main{

    static int[] newArray = new int[6];

    public static void main(String[] args) {
        int []array = {5,8,1,2,9,6};
        mergeSort(array, 0, array.length-1);
        for (int i: newArray) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] array, int lb, int mid, int ub){

        int i = lb;
        int j = mid+1;
        int k = lb;
        while(i <= mid && j <= ub){
            if(array[j] < array[i]){
                newArray[k] = array[j];
                j++;
            }
            else if(array[j] >= array[i]){
                newArray[k] = array[i];
                i++;
            }
            k++;
        }
        while (i <= mid) {
                newArray[k] = array[i];
                i++;
                k++;
            }
        while (j <= ub) {
                newArray[k] = array[j];
                j++;
                k++;
            }
    }

    public static void mergeSort(int[] array, int lb, int ub){
        if(lb < ub) {
            int mid = lb + (ub-lb)/ 2;
            mergeSort(array, lb, mid);
            mergeSort(array, mid+1, ub);
            merge(array, lb, mid, ub);
        }
    }
}