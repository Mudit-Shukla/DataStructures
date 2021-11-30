/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 10-11-2021
 *   Time: 11:20
 *   File: CircularLinnkedList2.java
 */

package lists.circularLinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList2 {
    private Node last;
    private int length;

    public CircularLinkedList2(){
        last = null;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){
        if(last == null)
            return;
        Node first = last.next;
        while(first != last){
            System.out.print(first.data + "  ");
            first = first.next;
        }

        System.out.print(first.data + "  ");
    }

    public void insertFirst(int data){
        Node temp = new Node(data);
        if(last ==  null){
            last = temp;
        }else
            temp.next = last.next;
        last.next = temp;
        length++;
    }

    public void insertAtLast(int data){
        Node temp = new Node(data);
        if(last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
    }

    public void deleteAtFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        Node temp = last.next;
        if(last.next == last)
            last = null;
        else
            last.next = temp.next;

        temp.next = null;

    }

    public static void main(String[] args) {
        CircularLinkedList2 list = new CircularLinkedList2();
//        list.createCircularLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();
    }
}
