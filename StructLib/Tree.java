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
	public void addChild(E data){
		Tree<E> child = new Tree<E>(data);
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
}