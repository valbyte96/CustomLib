/** TestGraph.java
 * @author: Val McCulloch
 * @version: 8/22/2017
 * A few initial tests for Graph and Node classes
 */

public class TestGraph {

	public static void main(String[] args) {
		Graph<String> graph = new Graph<String>();
		Node<String> n1 = new Node<String>(); //test two constructors
		Node<String> n2 = new Node<String>("data");
		Node<String> n3 = new Node<String>();
		graph.add(n1);
		graph.add(n2);
		System.out.println("graph nodes:");
		graph.printNodes(); //ensure nodes add

		//test 1 a
		//connect nodes
		n1.add(n2); //n1 --> n2
		//n2.add(n1);
		n1.dirAdd(n2); //n1 <--> n2
		System.out.println("n1:");
		n1.printNeighbors(); //check connections only added once
		System.out.println("n2:");
		n2.printNeighbors();

		//test 1 b
		n3.dirAdd(n1);
		n3.dirAdd(n2);
		System.out.println("n1:");
		n1.printNeighbors(); //check connections only added once
		System.out.println("n2:");
		n2.printNeighbors();
		System.out.println("n3:");
		n3.printNeighbors();


	}
}