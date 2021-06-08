/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-03-2021
 *   Time: 03:02
 *   File: graphs.Main.java
 */

package Queue.priorityQueue;

public class Main {
    public static void main(String[] args){
        QueueStructure<Integer> queue = new QueueStructure<>();
        queue.insertAccordingToPriority(20, 5);
        queue.insertAccordingToPriority(50,4);
        queue.insertAccordingToPriority(60, 6);
        queue.insertAccordingToPriority(80, 1);
        queue.insertAccordingToPriority(100,2);
        queue.display();
    }
}
