/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-06-2021
 *   Time: 14:15
 *   File: BinarySearch.java
 */

package searching;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int lengthOfArray = nums.length;
        int start = 0;
        int last = lengthOfArray-1;
        int foundIndex = -1;
        while(start <= last){
            int mid = (start+last)/2;
            if(nums[mid]==target){
                foundIndex = mid;
                break;
            }
            if(target>nums[mid]){
                start = mid+1;
            }
            if(target<nums[mid]){
                last = mid-1;
            }
        }
        return foundIndex;
    }
}

class Main{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(array, 6));
    }
}
