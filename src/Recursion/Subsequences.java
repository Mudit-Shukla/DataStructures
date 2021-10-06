/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-10-2021
 *   Time: 23:38
 *   File: Subsequences.java
 */

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abc";
        findSubsequences(str, 0, "");
        for(String element: list)
            System.out.println(element);
    }

    public static void findSubsequences(String str, int idx, String newString){

        if(idx == str.length()) {
            list.add(newString);
            return;
        }
        char ch = str.charAt(idx);
        findSubsequences(str, idx+1, newString+ch);
        findSubsequences(str, idx+1, newString);

    }
}
