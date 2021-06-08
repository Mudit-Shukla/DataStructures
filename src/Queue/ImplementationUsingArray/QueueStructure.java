/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 12:05
 *   File: QueueStructure.java
 */

package Queue.ImplementationUsingArray;

public class QueueStructure {
    int front = -1;
    int tail = -1;
    int[] arr;

    public QueueStructure(int size){
        arr = new int[size];
    }

    boolean enQueue(int data) {
        if (tail == -1) {
            tail ++;
            front ++;
            arr[tail] = data;
            return true;
        }else if(tail < arr.length){
            tail ++;
            arr[tail] = data;
            return true;
        }
        return false;
    }

    boolean deQueue(){
        if(front >= tail)
            return false;
        else
            front ++;
        return true;
    }

    void peek(){
        if(front == -1)
            System.out.println("Array is empty");
        else
            System.out.println(arr[front]);
    }

    void display(){
        for(int i = front; i <= tail; i++)
            System.out.println(arr[i]);
    }
}