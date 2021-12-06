/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-06-2021
 *   Time: 14:30
 *   File: SelectionSort.java
 */

package sortingtechniques;

public class SelectionSort {
    void selectionSort(int arr[])
    {
        int len = arr.length;
        for (int i = 0; i < len-1; i++)
        {
            int min = i;
            for (int j = i+1; j < len; j++)
                if (arr[j] < arr[min])
                    min = j;
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        void printArr(int arr[])
        {
            for (int i=0; i<arr.length; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        public static void main(String args[])
        {
            SelectionSort obj = new SelectionSort();
            int[] array = {10,100,20,60,40,30};
            System.out.print("Unsorted array : ");
            for(int element : array)
                System.out.print(element + " ");
            System.out.println();

            obj.selectionSort(array);
            System.out.print("Sorted array: ");
            obj.printArr(array);
        }
}
