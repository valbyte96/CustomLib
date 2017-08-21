/*TestStruct.java
@author: Val McCulloch
@version: 8/19/17 */

public class TestStruct {


    public static void main(String[] args){
	
	testTree(); //test tree (trie) class
	//testBinaryTree(); //test binary tree class
        }
    
    /*Test method for Tree.java*/
    public static void testTree(){
	Tree<String> root = new Tree<String>("R");
	Tree<String> a = new Tree<String>("A");
	Tree<String> b = new Tree<String>("B");
	Tree<String> c = new Tree<String>("C");
	Tree<String> d = new Tree<String>("D");
	Tree<String> e = new Tree<String>("E");
	Tree<String> f = new Tree<String>("F");
	Tree<String> g = new Tree<String>("G");

	root.addChild(a);
	root.addChild(b);
	a.addChild(c);
	a.addChild(d);
	b.addChild(e);
	b.addChild(f);
	b.addChild(g);

	root.print();

    }

    /*Test method for testBinaryTree.java*/
    public static void testBinaryTree(){
	//create a binary tree
	BinaryTree<Double> myTree = new BinaryTree<Double>(4.0);
	 
	//fill in left side first
	BinaryTree<Double> firstLeft = new BinaryTree<Double>(3.5);
	myTree.setLeft(firstLeft);
	BinaryTree<Double> leftLeft = new BinaryTree<Double>(1.75);
	firstLeft.setLeft(leftLeft);
	BinaryTree<Double> rightLeft = new BinaryTree<Double>(3.75);
	firstLeft.setRight(rightLeft);
	 
	//fill in right side
	BinaryTree<Double> firstRight = new BinaryTree<Double>(5.5);
	myTree.setRight(firstRight); 
	BinaryTree<Double> leftRight = new BinaryTree<Double>(4.75);
	firstRight.setLeft(leftRight);
	BinaryTree<Double> rightRight = new BinaryTree<Double>(8.5);
	firstRight.setRight(rightRight); 
	BinaryTree<Double> leftRightRight = new BinaryTree<Double>(7.0);
	rightRight.setLeft(leftRightRight);
	BinaryTree<Double> rightRightRight = new BinaryTree<Double>(13.0);
	rightRight.setRight(rightRightRight);
	 
	//print out full tree
	System.out.println("Tree:");
	myTree.print();
	System.out.println("");

    }



}