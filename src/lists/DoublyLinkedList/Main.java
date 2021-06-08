/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 28-02-2021
 *   Time: 00:47
 *   File: graphs.Main.java
 */

package lists.DoublyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtLast(50);
        list.insertAtLast(40);
        list.insertAtLast(30);
        System.out.println("=============");
        list.displayInReverseOrder();
        System.out.println("=============");
        list.display();
        System.out.println("=============");
        list.insertAtPosition(60,2);
        list.display();
        System.out.println("=============");
        list.insertAtPosition(80,1);
        list.display();
        System.out.println("=============");
        list.insertAtPosition(100,4);
        list.display();
    }
}
