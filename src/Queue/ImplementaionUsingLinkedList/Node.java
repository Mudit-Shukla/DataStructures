/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 10:45
 *   File: Node.java
 */

package Queue.ImplementaionUsingLinkedList;

public class Node {
    int data;
    Node next = null;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(){

    }
}
