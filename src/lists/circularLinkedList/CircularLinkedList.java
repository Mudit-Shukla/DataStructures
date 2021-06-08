/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 28-02-2021
 *   Time: 11:20
 *   File: CircularLinkedList.java
 */

package lists.circularLinkedList;

public class CircularLinkedList {

    Node head;
    Node tail;

    public void insertAtBeginning(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
            tail.next = head;
            System.out.println("value inserted at first");
        }else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            tail.next = head;
            System.out.println("value inserted at first");
        }
    }

    public void insertAtLast(int data){
        if(head == null)
            insertAtBeginning(data);
        else{
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            System.out.println("value inserted at last");
        }
    }

    public void deleteAtBeginning(){
        if(head == null)
            System.out.println("Underflow");
        else{
            tail.next = head.next;
            head = head.next;
        }
    }

    public void deleteAtLast(){
        if(head == null)
            System.out.println("underflow");
        else{
            Node temp = head;
            while(temp.next != tail)
                temp = temp.next;
            temp.next = head;
            tail = temp;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != tail){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }


}
