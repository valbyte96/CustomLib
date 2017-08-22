/** Tree.java
  * @author: Val McCulloch
  * @version: 8/19/2017
  * Implementation of a trie
  */

import java.util.ArrayList;


public class Tree<E> {

	private E data;
	private ArrayList<Tree<E>> children;

	public Tree(E data) {
		this.children = new ArrayList<Tree<E>>();
		this.data = data;
	}

	/*METHODS*/
	/**
	 * Add child to current node;
	 * adds to ArrayList "children"
	 * @param child, node/tree
	 */
	public void addChild(Tree<E> child) {
		this.children.add(child);
	}

	/*Accessor methods*/
	public E getData() {
		return this.data;
	}

	public ArrayList<Tree<E>> getChildren() {
		return this.children;
	}

	/*Setter methods*/

	/**
	 * Sets data of a specific node
	 * @param data
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**Calls printIndented */
	public void print() {
		printIndented(this, 0);
	}

	/**
	 *  Indents by the specified number of spaces
	 *  @param n  Number of spaces
	 */
	private static void indent(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(' ');
		}
	}
	/**
	 *  Prints the tree with indentation corresponding to level.
	 *  Basically a fancy version of preorder.
	 *
	 *  @param tree   current node to recurse on
	 *  @param depth  Level of this node, for indentation
	 */

	public void printIndented(Tree<E> tree, int depth) {
		indent(depth);
		System.out.println(tree.data);
		depth += 1;

		if (tree.children.size() > 0) {
			for (int i = 0; i < tree.children.size(); i++) {
				printIndented(tree.children.get(i), depth);

			}
		}
	}
}