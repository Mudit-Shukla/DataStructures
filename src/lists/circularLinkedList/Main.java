/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 02-03-2021
 *   Time: 09:19
 *   File: graphs.Main.java
 */

package lists.circularLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtBeginning(10);
        list.insertAtLast(30);
        list.insertAtBeginning(50);
        list.display();
    }
}
