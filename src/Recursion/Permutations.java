/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-10-2021
 *   Time: 01:40
 *   File: Permutations.java
 */

package Recursion;

import java.util.ArrayList;

public class Permutations {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        getPermutations("abc", "");
        for(String s : list)
            System.out.print(s + " ");
    }

    public static void getPermutations(String string, String answer){

        if(string.length() == 0){
            list.add(answer);
        }

        for(int i = 0; i< string.length(); i++){
            String leftPart = string.substring(0, i);
            String rightPart = string.substring(i+1);
            String remainingPart = leftPart + rightPart;
            getPermutations(remainingPart, answer + string.charAt(i));
        }
    }
}
