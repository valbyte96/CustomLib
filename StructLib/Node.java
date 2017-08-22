/** Node.java
 * @author: Val McCulloch
 * @version: 8/21/17
 * Node class intended to be used by Graph.java
 */

import java.util.ArrayList;

public class Node<E> {
	public E data;
	public ArrayList<Node<E>> neighbors;

	public Node(E data) {
		this.data = data;
		this.neighbors = new ArrayList<Node<E>>();

	}

}