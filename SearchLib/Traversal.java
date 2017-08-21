/**Traversal.java
 * @author: Val McCulloch
 * @version: 8/19/2017
 * Primary traversal methods.
 * Overloaded functions for Tries and Binary Trees
 */

import java.util.ArrayList;


public class Traversal{
	/*Traversals for BinaryTrees (BinaryTree.java) */

    public static void preOrder(BinaryTree tree){
    	if (tree != null){
    		System.out.println(tree.getData());
    		preOrder(tree.getLeft());
    		preOrder(tree.getRight());

    	}
    }

    public static void inOrder(BinaryTree tree){
    	if (tree != null){
    		inOrder(tree.getLeft());
    		System.out.println(tree.getData());
    		inOrder(tree.getRight());

    	}
    }

    public static void postOrder(BinaryTree tree){
    	if (tree != null){
    		postOrder(tree.getLeft());
    		postOrder(tree.getRight());
    		System.out.println(tree.getData());

    	}
    }


/********************************************************************/


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

    //@TODO
    public static void inOrder(Tree tree){
    	if (tree != null){
    		ArrayList<Tree> children = tree.getChildren();
    		for (int i=0; i<children.size(); i++){
    			inOrder(children.get(i));
    			//System.out.println(tree.getData());
    		}    		
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

