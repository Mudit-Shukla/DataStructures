/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 19:31
 *   File: graphs.Main.java
 */

package Stack.ImplementationUsingArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackStructureInArray stack = new StackStructureInArray(10);
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.display();
        stack.peek();
        stack.pop();
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.display();
        stack.pop();
        stack.peek();
    }
}
