/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-06-2021
 *   Time: 13:48
 *   File: LinearSearch.java
 */

package lists;

import lists.SinglyLinkedlList.SinglyLinkedList;

public class LinearSearch {

    Node head;

    public void search(int data){
        Node temp = head;
        while(temp != null){
            if (temp.data == data){
                System.out.println("the requested data is present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("the requested is not present");
    }
}

class LinearSearchMain{
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtTop(50);
        list.insertAtTop(70);
        list.insertAtTop(60);
        list.insertAtTop(80);
        list.insertAtTop(90);
        list.insertAtTop(100);
        LinearSearch obj = new LinearSearch();
        obj.search(90);

    }
}
