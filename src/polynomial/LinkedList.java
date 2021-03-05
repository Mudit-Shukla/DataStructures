/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-03-2021
 *   Time: 23:10
 *   File: LinkedList.java
 */

package polynomial;

public class LinkedList {
    Node head;

    public void insertAtBeginning(int coefficient, int exponent){
        Node newNode = new Node(coefficient, exponent);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAtLast(int coefficient, int exponent){
        Node newNode = new Node(coefficient, exponent);
        if(head == null)
            insertAtBeginning(coefficient, exponent);
        else{
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public LinkedList addPolynomial(LinkedList polynomial){
        LinkedList polynomial2 = this;
        Node head1 = polynomial.head;
        Node head2 = polynomial2.head;
        LinkedList addedPolynomial = new LinkedList();

        while(head1 != null && head2 != null){
            if(head1.exponent == head2.exponent){
                addedPolynomial.insertAtLast((head1.coefficient + head2.coefficient),head1.exponent);
                head1 = head1.next;
                head2 = head2.next;
            }else if(head1.exponent < head2.exponent){
                addedPolynomial.insertAtLast(head2.coefficient, head2.exponent);
                head2 = head2.next;
            }
            else {
                addedPolynomial.insertAtLast(head1.coefficient, head1.exponent);
                head1 = head1.next;
            }
        }
        return addedPolynomial;
    }


    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.coefficient + "x^" + temp.exponent + " + ");
            temp = temp.next;
        }
        System.out.print(temp.coefficient + "x^" + temp.exponent);
        System.out.println("\n");
    }

}
