/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-03-2021
 *   Time: 02:52
 *   File: QueueStructure.java
 */

package Queue.priorityQueue;

public class QueueStructure<E> {
    Node<E> head;

    public void insertAccordingToPriority(E data, int priority){
        if(head == null || head.priority < priority){
            Node<E> newNode = new Node<>(data, priority);
            newNode.next = head;
            head = newNode;
            System.out.println("node inserted "+ priority);
            return;
        }else{
            Node<E> temp = head;
            Node<E> newNode = new Node<E>(data, priority);
            while (temp.next != null){
                if(temp.next.priority < priority){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    System.out.println("node inserted "+ priority);
                    return;
                }
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node<E> temp = head;
            while(temp != null){
                System.out.println("Data : " + temp.data + " priority : " + temp.priority + "\n");
                temp = temp.next;
            }
        }
    }
}
