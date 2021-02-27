/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2021
 *   Time: 12:16
 *   File: Main.java
 */

package Queue.ImplementationUsingArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueStructure queue = new QueueStructure(5);
        queue.enQueue(sc.nextInt());
        queue.enQueue(sc.nextInt());
        queue.enQueue(sc.nextInt());
        System.out.println("==================");
        queue.display();
        System.out.println("==================");
        queue.deQueue();
        System.out.println("==================");
        queue.enQueue(sc.nextInt());
        queue.peek();
        System.out.println("==================");
        queue.display();

    }
}
