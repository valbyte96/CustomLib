/** TestGraphSearches.java
 * testing class for depth first, breadth first, 
 * and bidirectional searches
 */

public class TestGraphSearches{

	public static void main(String[] args){
		uGraph1();
		//dGraph1();

	}

	/** BUILD GRAPHS FOR TESTING **/
	// builds and tests an undirected graph on 6 nodes
	public static void uGraph1(){
		//build graph
		Graph<String> graph = new Graph<String>();
		Node<String> n1 = new Node<String>("A");
		Node<String> n2 = new Node<String>("B");
		Node<String> n3 = new Node<String>("C");
		Node<String> n4 = new Node<String>("D");
		Node<String> n5 = new Node<String>("E");
		Node<String> n6 = new Node<String>("F");

		graph.add(n1);
		graph.add(n2);
		graph.add(n3);
		graph.add(n4);
		graph.add(n5);
		graph.add(n6);

		n1.dirAdd(n2);
		n1.dirAdd(n3);
		n3.dirAdd(n2);
		n3.dirAdd(n4);
		n4.dirAdd(n5);
		n5.dirAdd(n6);
		n6.dirAdd(n2);

		// begin tests
		//graph.depth(n1);
		graph.breadth(n1);

	}

	//builds and tests a directed graph
	public static void dGraph1() {
		//build graph
		Graph<String> graph = new Graph<String>();
		Node<String> n1 = new Node<String>("A");
		Node<String> n2 = new Node<String>("B");
		Node<String> n3 = new Node<String>("C");

		graph.add(n1);
		graph.add(n2);
		graph.add(n3);

		n2.add(n1);
		n3.add(n1);

		//graph.depth(n1);
		//graph.depth(n2);
	}



}