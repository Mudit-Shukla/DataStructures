/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 12:36
 *   File: StackStructure.java
 */

package Stack.implementationUsingLinkedList;

public class StackStructure {
    Node top = null;

    void push(int data){
        if(top == null)
            top = new Node(data);
        else{
            Node newNode= new Node(data);
            newNode.next = top;
            top = newNode;
        }
    }

    void pop(){
        if(top != null){
            top = top.next;
            System.out.println("Value successfully deleted");
        }else
            System.out.println("List is empty");
    }

    void peek(){
        if(top != null)
            System.out.println(top.data);
        else
            System.out.println("List is empty");
    }

    void display(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
