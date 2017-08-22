/** Node.java
 * @author: Val McCulloch
 * @version: 8/21/17
 * Node class intended to be used by Graph.java
 */

import java.util.ArrayList;

public class Node<E> {
	//fields
	public E data;
	public ArrayList<Node<E>> neighbors;

	//constructor 1
	public Node(E data) {
		this.data = data;
		this.neighbors = new ArrayList<Node<E>>();

	}
	// constructor 2
	public Node() {
		this.data = null;
		this.neighbors = new ArrayList<Node<E>>();

	}

	//methods

	/** remove node from neighbor list
	 *  @param: node, node to be removed
	 */
	public void removeNeighbor(Node node) {
		if (this.neighbors.contains(node)) {
			this.neighbors.remove(node);
		}
	}

	/** double connects connect node to neighbor
	 *  connects neighbor back to node
	 *	@param node, node self is connecting to
	 */
	public void dirAdd(Node node) {
		if (this.neighbors.contains(node) == false) {
			this.neighbors.add(node);
		}
		node.add(this); //add self to neighbor
	}
	/** single connects connect node to neighbor
	 *	@param node, node self is connecting to
	 */
	public void add(Node node) {
		if (this.neighbors.contains(node) == false) {
			this.neighbors.add(node);
		}
	}

	/**Testing function; print out neighbors'
	 * memory location
	 */
	public void printNeighbors() {
		for (int i = 0; i < this.neighbors.size(); i++) {
			System.out.println(this.neighbors.get(i));
		}
	}

}