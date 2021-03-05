/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 21:07
 *   File: DoublyLinkedList.java
 */

package lists.DoublyLinkedList;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.previous = null;
            newNode.next = null;
            tail = head;
        }
        else{
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null)
            insertAtBeginning(data);
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    void insertAtPosition(int data, int position){
        if(position == 1)
            insertAtBeginning(data);
        else if(position == getLength())
            insertAtLast(data);
        else {
            Node currentNode = getNode(position-1);
            Node newNode = new Node(data);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            newNode.next = currentNode;
            newNode.next.previous = newNode;

        }
    }

    void deleteAtBeginning(){
        head = head.next;
        head.previous = null;
    }

    void deleteAtLast(){
        tail = tail.previous;
        tail.next = null;
    }

    void deleteAtPosition(int position){
        if(position == 1)
            deleteAtBeginning();
        else if(position == getLength())
            deleteAtLast();
        else{
            int count = 0;
            Node temp = head;
            while(count < position-1){
                ++count;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.next.previous = temp;
        }
    }

    void displayInReverseOrder(){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int getLength(){
        Node temp = head;
        int count = 0;
        while(temp != tail){
            count++;
            temp = temp.next;
        }
        return count;
    }

    Node getNode(int index){
        Node temp = head;
        for(int i = 0; i< index-1; i++)
            temp = tail.next;
        return temp;
    }



}
