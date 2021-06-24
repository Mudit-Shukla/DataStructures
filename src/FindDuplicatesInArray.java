/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-06-2021
 *   Time: 11:56
 *   File: FindDuplicatesInArray.java
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicatesInArray {

    int[] array;
    HashMap<Integer, Integer> map = new HashMap<>();

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

        for(int i =0; i< array.length; i++){
            if(map.containsKey(array[i])){
                int count = map.get(array[i]);
                count += 1;
                map.put(array[i], count);
            }else
                map.put(array[i], 1);
        }
    }

    public void printDuplicates(){
        for(Map.Entry<Integer, Integer> value : map.entrySet()){
            if(value.getValue() > 1)
                System.out.println(value.getKey());
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        FindDuplicatesInArray obj = new FindDuplicatesInArray(sizeOfArray);
        obj.insertElementsInArray();
        obj.searchDuplicateElements();
        obj.printDuplicates();
    }
}
