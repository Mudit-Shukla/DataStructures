/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 19:18
 *   File: StackStructureInArray.java
 */

package Stack.ImplementationUsingArray;

public class StackStructureInArray {
    int top = -1;
    int arr[];

    public StackStructureInArray (int size ){
        arr = new int[size];
    }

    public void push(int data) {
        if(top < arr.length){
            top ++;
            arr[top] = data;
        }else{
            System.out.println("Overflow");
        }
    }

    public void pop(){
        if(top < 0){
            System.out.println("underflow");
            return;
        }else
            top --;
    }

    public void peek(){
        System.out.println(arr[top]);
    }

    public void display(){
        for(int i = top; i >= 0 ; i--)
            System.out.println(arr[i]);
    }
}
