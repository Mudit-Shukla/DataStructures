/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-12-2021
 *   Time: 22:17
 *   File: LinearSearch.java
 */

package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 60, 50, 30, 100};
        int targetValue = 30;
        boolean flag = false;
        for(int i = 0; i< array.length; i++){
            if(array[i] == targetValue){
                flag = true;
                System.out.println("Element found at " + (i+1) + " position");
                break;
            }
        }
        if(!flag)
            System.out.println("Element not found");
    }
}
