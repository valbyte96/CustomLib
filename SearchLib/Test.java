/**Test.java
@author: Val McCulloch
@version: 8/21/17

Testing class for traversals

 */



public class Test{
    
    public static void main(String[] args){
    	//TEST NO. 1: trie testing
    	System.out.println("Test Trie Traversals");
    	Tree<String> tTree = createTree();
    	System.out.println("Struct:");
    	tTree.print(); //display trie
    	System.out.println("PreOrder:");
    	Traversal.preOrder(tTree); //preOrder traversal
    	System.out.println("InOrder:");
    	Traversal.inOrder(tTree); //inOrder traversal
    	System.out.println("PostOrder:");
    	Traversal.postOrder(tTree); //postOrder traversal

    	System.out.println(); //blank line

    	//TEST NO. 2: binary tree testing
    	System.out.println("Test Binary Tree Traversals");
    	BinaryTree<String> bTree = createBinaryTree(); 
    	System.out.println("Struct:");
    	bTree.print(); //display tree
    	System.out.println("PreOrder:");
    	Traversal.preOrder(bTree); //preOrder traversal
    	System.out.println("InOrder:");
    	Traversal.inOrder(bTree); //inOrder traversal
    	System.out.println("PostOrder:");
    	Traversal.postOrder(bTree); //postOrder traversal

    }


    public static Tree<String> createTree(){
    	//init nodes
    	Tree<String> root = new Tree<String>("R");
		Tree<String> a = new Tree<String>("A");
		Tree<String> b = new Tree<String>("B");
		Tree<String> c = new Tree<String>("C");
		Tree<String> d = new Tree<String>("D");
		Tree<String> e = new Tree<String>("E");
		Tree<String> f = new Tree<String>("F");
		Tree<String> g = new Tree<String>("G");

		//assemble tree
		root.addChild(a);
		root.addChild(b);
		a.addChild(c);
		a.addChild(d);
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		return root;
    }

    public static BinaryTree<String> createBinaryTree(){
    	//init nodes
    	BinaryTree<String> root = new BinaryTree<String>("R");
    	BinaryTree<String> a = new BinaryTree<String>("A");
    	BinaryTree<String> b = new BinaryTree<String>("B");
    	BinaryTree<String> c = new BinaryTree<String>("C");
    	BinaryTree<String> d = new BinaryTree<String>("D");
    	BinaryTree<String> e = new BinaryTree<String>("E");

    	//assemble tree
    	root.setLeft(a);
    	root.setRight(b);
    	a.setLeft(c);
    	a.setRight(d);
    	b.setLeft(e);
    	return root;


    }

}