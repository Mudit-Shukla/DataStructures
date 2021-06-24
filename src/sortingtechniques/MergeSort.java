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

        mergeSort(0,array.length-1);
        for(int i =0; i< tempArray.length; i++)
            array[i] = tempArray[i];
        for(int i : array)
            System.out.println(i);

    }

    public static void mergeSort(int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(left, mid);
            mergeSort(mid+1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int k = i;

        while(i <= mid && j <= right){
            if(array[i] < array[j]){
                tempArray[k] = array[i];
                ++i;
            }else {
                tempArray[k] = array[j];
                ++j;
            }
            ++k;
        }
        while(i <= mid){
            tempArray[k] = array[i];
            k++;
            i++;
        }
        while (j <= right){
            tempArray[k] = array[j];
            k++;
            j++;
        }
    }

}