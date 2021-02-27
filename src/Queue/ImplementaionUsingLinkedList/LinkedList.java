/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 10:49
 *   File: LinkedList.java
 */

package Queue.ImplementaionUsingLinkedList;

public class LinkedList {

    Node head;


    public boolean enQueue(int item) {

        if (isEmpty()) {
            head = new Node(item);
            return true;
        }
        else {
            Node newNode = new Node(item);
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
            return true;
        }
    }

    public boolean deQueue() {
        if(isEmpty())
            return false;
        head =head.next;
        return true;
    }


    public void peek() {
        System.out.println(head.data);
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
