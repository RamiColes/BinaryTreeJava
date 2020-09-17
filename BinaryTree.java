/**
 * 
 * @author Rami Coles
 * This class represents the binary tree.
 * It starts with a root node and is built on that root.
 *
 */
public class BinaryTree {
	private Node root;
	
	public BinaryTree(int value) {
		this.root = new Node(value);
	}
	
	/**
	 * This method determines where the new data is to be placed recursively.
	 * If the value is lower than that of the node you got to the left child and check if it has children,
	 * otherwise you create a new Node on the empty left child.
	 * If the value is higher you do the same with the right child.
	 * 
	 * @param value, the value to insert.
	 * @param n, the node on which we currently are looking
	 */
	private void findNodeToInsert(int value, Node n) {
		if(value < n.getValue()) { //New value lower than value of current node
			if(n.getLeftChild() == null)
				n.addLeftChild(value);
			else 
				findNodeToInsert(value, n.getLeftChild()); //If node already has left child look into left child
		} else { //New value higher than value of current node
			if(n.getRightChild() == null)
				n.addRightChild(value);
			else
				findNodeToInsert(value, n.getRightChild()); //If node already has right child look into right child
		}
	}
	
	/**
	 * This method starts the process of the insertion of new Node at the root
	 * (May not be necessary if we modify code)
	 * @param value, value to insert
	 */
	public void insertNode(int value) {
		findNodeToInsert(value, this.root);
	}
	
	/**
	 * This method will travel through the whole tree and print out all the values recursively.
	 * @param n, the current node
	 */
	private void recursiveTravel(Node n) {
		if(n.getLeftChild() != null) {
			Node lc = n.getLeftChild();
			System.out.println(lc.getValue());
			recursiveTravel(lc);
		}
		if(n.getRightChild() != null) {
			Node rc = n.getRightChild();
			System.out.println(rc.getValue());
			recursiveTravel(rc);
		}
	}
	
	/**
	 * This method starts the process of traveling the tree at the root
	 * (May not be necessary if we modify code)
	 */
	public void travel() {
		System.out.println(root.getValue());
		recursiveTravel(this.root);
	}
}
