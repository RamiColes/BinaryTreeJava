
public class Node {
	private int value;
	private Node leftChild = null;
	private Node rightChild = null;

	
	public Node(int value) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
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
