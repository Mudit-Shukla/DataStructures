/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-03-2021
 *   Time: 23:09
 *   File: Node.java
 */

package polynomial;

public class Node {
    int coefficient;
    int exponent;
    Node next;

    public Node( int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}
