/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 12:45
 *   File: Main.java
 */

package Stack.implementationUsingLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackStructure stack = new StackStructure();
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.peek();
        System.out.println("=============");
        stack.display();
        stack.pop();
        stack.peek();
        System.out.println("=============");
        stack.display();
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.peek();
        System.out.println("=============");
        stack.pop();
        stack.display();
        System.out.println("=============");
        stack.peek();
    }
}
