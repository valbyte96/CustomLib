/** Tree.java
  * @author: Val McCulloch
  * @version: 9/17/2017
  * 
  */
import java.util.ArrayList;


public class Tree<E>{

	private E data;
	private ArrayList<Tree<E>> children;

	public Tree(E data){
		this.children = new ArrayList<Tree<E>>();
		this.data = data;
	}

	/*METHODS*/
	public void addChild(Tree<E> child){
		this.children.add(child);
	}

	/*Accessor methods*/
	public E getData(){
		return this.data;
	}

	/*Setter methods*/
	public void setData(E data){
		this.data = data;
	}

	public void print(){
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

    public void printIndented(Tree<E> tree, int depth) {
    	indent(depth);
    	System.out.println(tree.data);
    	depth+=1;

    	if (tree.children.size()>0){
    		for (int i=0; i<tree.children.size(); i++){
    			printIndented(tree.children.get(i), depth);

    		}
    	} 
    }
}