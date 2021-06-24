/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-06-2021
 *   Time: 11:56
 *   File: FindDuplicatesInArray.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicatesInArray {

    int[] array;

    public FindDuplicatesInArray(int size){
        array = new int[size];
    }

    public void insertElementsInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + "elements");
        for(int i =0; i< array.length; i++)
            array[i] = sc.nextInt();
    }

    public void searchDuplicateElements() {
        Arrays.sort(array);
        for(int i = 0; i< array.length-1; i++){
            if(array[i] == array[i+1])

        }

    }
}
