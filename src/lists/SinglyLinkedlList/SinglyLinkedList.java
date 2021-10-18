/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 19:51
 *   File: SinglyLinkedList.java
 */

package lists.SinglyLinkedlList;

public class SinglyLinkedList {
    public Node head;

    public void insertAtTop(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtLast(int data){
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = new Node(data);
    }

    public void insertAtPosition(int data, int position){
        if(position > getLength()){
            System.out.println("Sorry the length of list is " + getLength() + " could not insert the data");
            return;
        }else if(position == getLength())
            insertAtLast(data);
        else if(position == 0)
            insertAtTop(data);
        else{
            Node temp = head;
            int count = 0;
            while(count < position-1){
                temp = temp.next;
                ++count;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    public void deleteAtTop(){
        if(head == null)
            System.out.println("Could not be deleted");
        else
            head = head.next;
    }

    public void deleteAtLat(){
        if(head.next == null || head == null)
            return;
        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public void deleteAtPosition(int position){
        if(position == getLength()-1)
            deleteAtLat();
        else if(position == 1)
            deleteAtTop();
        else if(position < getLength()){
            Node temp = head;
            int count = 0;
            while(count < position){
                temp = temp.next;
                ++count;
            }
            temp.next = temp.next.next;
        }
    }

    public int getLength(){
        int count = 0;
        Node temp = head;
        if(head == null)
            return 0;
        while(temp != null){
            temp = temp.next;
            ++count;
        }
        return count;
    }

    public void display(){
        Node temp = head;
        int index = 1;
        while(temp != null){
            System.out.println(index ++ + "    " +  temp.data);
            temp = temp.next;
        }
    }

    public Node getHead(){
        return head;
    }

    public Node getMiddle(){
        Node temp = head;
        Node fastPointer = head;{
            while(fastPointer != null  && fastPointer.next != null){
                fastPointer = fastPointer.next.next;
                temp = temp.next;
            }
            return temp;
        }
    }

    public Node getNthElementFromEnd(int n){
        if(head == null )
            return null;
        Node mainPtr = head;
        Node refPtr = head;
        int count = 0;
        while(count < n){
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }
}
