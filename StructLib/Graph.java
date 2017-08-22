/** Graph.java
 * @author: Val McCulloch
 * @version: 8/21/17
 *
 */
import java.util.ArrayList;

public class Graph {
	//fields
	private boolean directed;
	private ArrayList<Node<E>> nList;

	//constructor
	public Graph(boolean directed) {
		this.directed = directed;
		this.nList = new ArrayList<Node<E>>();


	}

	/** METHODS **/

	/** adds node to graph
	 *  @param: node, node added to graph
	 */
	public void addNode(Node node) {
		this.nList.add(node);
	}
	/** remove node from graph
	 *  @param: node, node removed from graph
	 */
	public void removeNode(Node node) {
		for (int i = 0; i < this.nList.size(); i++) {
			if (this.nList.get(i) == node){
				this.nList.remove(i);
				updateNeighbors(node); //remove this node from neighbors
				break;
			}
		}
	}
	/** remove node from neighbor lists of other nodes
	 *  @param: node, node removed from lists
	 */
	public void updateNeighbors(Node node){
		//TODO
	}

	/**
	 * Print current nodes in graph
	 */
	public void printNodes() {
		for (int i = 0; i < this.nList.size(); i++) {
			System.out.println(this.nList.get(i));
		}
	}

	/** */





}