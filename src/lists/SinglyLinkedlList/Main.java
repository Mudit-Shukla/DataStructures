/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 20:05
 *   File: graphs.Main.java
 */

package lists.SinglyLinkedlList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        list.insertAtTop(sc.nextInt());
        list.insertAtTop(sc.nextInt());
        list.display();
        list.insertAtLast(sc.nextInt());
        list.display();
        System.out.println("===============");
        //list.insertAtLast(sc.nextInt());
        System.out.println(list.getLength());
        list.insertAtPosition(sc.nextInt(),sc.nextInt());
        list.display();
        list.insertAtPosition(sc.nextInt(), sc.nextInt());
        System.out.println("===============");
        list.display();
        System.out.println(list.getLength());
        System.out.println("===============");
        list.deleteAtLat();
        System.out.println("===============");
        list.display();
        System.out.println("===============");
        list.deleteAtTop();
        System.out.println("===============");
        list.display();
        System.out.println("===============");
        list.deleteAtPosition(sc.nextInt());
        System.out.println("===============");
        list.display();
        System.out.println("===============");
        list.deleteAtPosition(sc.nextInt());
        list.display();

    }
}
