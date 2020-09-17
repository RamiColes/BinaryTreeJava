/**
 * 
 * @author Rami Coles
 * This class represents a node of the tree. It can have a left child and a right child
 * and stores and integer.
 */
public class Node {
	private int value;
	//Each nodes starts with no children which can be added with the use of the BinaryTree class.
	private Node leftChild = null;
	private Node rightChild = null;

	
	public Node(int value) {
		this.value = value;
	}
	
	public void addLeftChild(int value) {
		this.leftChild = new Node(value);
	}
	
	public void addRightChild(int value) {
		this.rightChild = new Node(value);
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node getLeftChild() {
		return this.leftChild;
	}
	
	public Node getRightChild() {
		return this.rightChild;
	}
}
