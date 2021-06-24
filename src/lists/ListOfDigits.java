/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-06-2021
 *   Time: 11:16
 *   File: ListOfDigits.java
 */

package lists;

import java.util.Scanner;

public class ListOfDigits {

    Node head;

    public void breakNumbers(int number){
        int temp = number;
        while(temp > 0){
            int digit = temp % 10;
            insertAtBeginning(digit);
            temp /= 10;
        }
        display();
    }

    private void insertAtBeginning(int data){
        if(head == null)
            head = new Node(data);
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    private void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


}

class Node{
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ListOfDigits obj = new ListOfDigits();
        obj.breakNumbers(number);

    }
}
