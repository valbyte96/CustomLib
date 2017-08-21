/**Traversal.java
 * @author: Val McCulloch
 * @version: 8/19/2017
 * Primary traversal methods; meant for tries or Tree.java struct
 */

import java.util.ArrayList;


public class Traversal{
	/*Traversals for BinaryTrees (Tree.java) */

    public static void preOrder(BinaryTree tree){
    	if (tree != null){
    		System.out.println(tree.getData());
    		preOrder(tree.getLeft());
    		preOrder(tree.getRight());

    	}
    }

    public static void inOrder(BinaryTree tree){
    	if (tree != null){
    		preOrder(tree.getLeft());
    		System.out.println(tree.getData());
    		preOrder(tree.getRight());

    	}
    }

    public static void postOrder(BinaryTree tree){
    	if (tree != null){
    		preOrder(tree.getLeft());
    		preOrder(tree.getRight());
    		System.out.println(tree.getData());

    	}
    }





	/*Traversals for Tries (Tree.java) */
    public static void preOrder(Tree tree){
    	if (tree != null){
    		System.out.println(tree.getData());
    		ArrayList<Tree> children = tree.getChildren();
    		for (int i=0; i<children.size(); i++){
    			preOrder(children.get(i));
    		}

    	}
    }

    public static void inOrder(Tree tree){
    	if (tree != null){

    		System.out.println(tree.getData());

    	}
    }

    public static void postOrder(Tree tree){
    	if (tree != null){
    		ArrayList<Tree> children = tree.getChildren();
    		for (int i=0; i<children.size(); i++){
    			postOrder(children.get(i));
    		}
    		System.out.println(tree.getData());
    	}
    }
}

