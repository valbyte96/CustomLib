
public class TestStruct {


    public static void main(String[] args){
	// Test Binary Tree Class
	testBinaryTree();
        }


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