/** Graph.java
 * @author: Val McCulloch
 * @version: 8/21/17
 *
 */
import java.util.ArrayList;

public class Graph<E> {
	//fields
	private boolean directed;
	private ArrayList<Node<E>> nList;

	//constructor
	public Graph() {
		this.nList = new ArrayList<Node<E>>();


	}

	/** METHODS **/

	/** adds node to graph
	 *  @param: node, node added to graph
	 */
	public void add(Node node) {
		this.nList.add(node);
	}
	/** remove node from graph
	 *  @param: node, node removed from graph
	 */
	public void remove(Node node) {
		if (this.nList.contains(node)){
			this.nList.remove(node);
		}
	}
	/** remove node from neighbor lists of other nodes
	 *  @param: node, node removed from lists
	 */
	public void updateNeighbors(Node node) {
		for (int i = 0; i < this.nList.size(); i++) {
			this.nList.get(i).removeNeighbor(node);
		}
	}

	/** Testing function
	 * Print current nodes' in graph memory location
	 */
	public void printNodes() {
		for (int i = 0; i < this.nList.size(); i++) {
			System.out.println(this.nList.get(i));
		}
	}


	/** */

}