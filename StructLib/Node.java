/** Node.java
 * @author: Val McCulloch
 * @version: 8/21/17
 * Node class intended to be used by Graph.java
 */

import java.util.ArrayList;

public class Node<E> {
	//fields
	private E data;
	private ArrayList<Node<E>> neighbors;
	private boolean visited; //for traversals

	//constructor 1
	public Node(E data) {
		this.data = data;
		this.neighbors = new ArrayList<Node<E>>();
		this.visited = false; //init false

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
		if (!this.neighbors.contains(node)) {
			this.neighbors.add(node);
		}
		node.add(this); //add self to neighbor
	}
	/** single connects connect node to neighbor
	 *	@param node, node self is connecting to
	 */
	public void add(Node node) {
		if (!this.neighbors.contains(node)) {
			this.neighbors.add(node);
		}
	}

	//functions for traversing
	public void visit() {
		this.visited = true;
	}

	public boolean visited() {
		return this.visited;
	}

	public E getData() {
		return this.data;
	}

	public ArrayList<Node<E>> getNeighbors() {
		return this.neighbors;
	}

	public int getNumNeighbors() {
		return this.neighbors.size();
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