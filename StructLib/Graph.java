/** Graph.java
 * @author: Val McCulloch
 * @version: 8/21/17
 *
 */
import java.util.ArrayList;
import java.util.Queue; // for BFS
import java.util.LinkedList;

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
		if (this.nList.contains(node)) {
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


	/** SEARCHING FUNCTIONS **/
	/**implementation of depth first search
	 * @params node, starting node
	 */
	public void depth(Node node) {
		if (node != null) { 
			System.out.println(node.getData()); //"visit"
			node.visit(); //record visited
			ArrayList<Node> neighbors = node.getNeighbors(); 
			for (int i = 0; i < neighbors.size(); i++) { //for each neighbor
				Node neighbor = neighbors.get(i);
				if (!neighbor.visited()) { //recurse if neighbor not visited
					depth(neighbor);
				}
			}
		}
	}
	/**implementation of breadth first search
	 * @params node, starting node
	 */
	public void breadth(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		node.visit();
		queue.add(node); //add starting node

		while(!queue.isEmpty()){ //while there are items in queue
			Node n = queue.remove(); //remove from start
			ArrayList<Node> neighbors = n.getNeighbors();
			System.out.println(n.getData());
			for(int i = 0; i<neighbors.size(); i++){
				Node neighbor = neighbors.get(i);
				if (!neighbor.visited()){
					neighbor.visit();
					queue.add(neighbor);
				}
			}

		}

	}
	/**implementation of dijkstra's algorithm
	 * @params start, starting node
	 * @params finish, destination node 
	 */
	public void dijkstra(Node start, Node finish) {
		//TODO
	}

}