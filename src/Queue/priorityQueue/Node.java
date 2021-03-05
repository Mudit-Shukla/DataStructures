/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-03-2021
 *   Time: 02:50
 *   File: Node.java
 */

package Queue.priorityQueue;

public class Node<E> {
    E data;
    int priority;
    Node<E> next;

    public Node(E data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
