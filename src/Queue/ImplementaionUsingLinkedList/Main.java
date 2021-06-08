/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 11:49
 *   File: graphs.Main.java
 */

package Queue.ImplementaionUsingLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        linkedList.enQueue(sc.nextInt());
        linkedList.enQueue(sc.nextInt());
        linkedList.enQueue(sc.nextInt());
        linkedList.enQueue(sc.nextInt());
        linkedList.enQueue(sc.nextInt());
        System.out.println("========================");
        linkedList.display();
        System.out.println("========================");
        linkedList.deQueue();
        linkedList.peek();
        System.out.println("========================");
        linkedList.display();
        System.out.println("========================");

    }
}
