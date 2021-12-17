/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 17-12-2021
 *   Time: 10:10
 *   File: HeapSort.java
 */

package sortingtechniques;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr={1,2,5,41,562,78,6,8,9,4};
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        System.out.print("Sorted array is ");
        printArray(arr);
    }

    public static void heapify(int[] arr,int n,int i){
        int largest =i;
        int l=2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest =l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest =r;
        }
        if(largest!=i){
            int swap =arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int[] arr){
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
    public void sort(int[] arr){
        int n =arr.length;
        for(int i =n/2 -1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

}