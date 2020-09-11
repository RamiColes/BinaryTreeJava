
public class BinaryTree {
	private Node root;
	
	public BinaryTree(int value) {
		this.root = new Node(value);
	}
	
	private void findNodeToInsert(int value, Node n) {
		if(value < n.getValue()) {
			if(n.getLeftChild() == null)
				n.addLeftChild(value);
			else
				findNodeToInsert(value, n.getLeftChild());
		} else {
			if(n.getRightChild() == null)
				n.addRightChild(value);
			else
				findNodeToInsert(value, n.getRightChild());
		}
	}
	
	public void insertNode(int value) {
		findNodeToInsert(value, this.root);
	}
	
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
	
	public void travel() {
		System.out.println(root.getValue());
		recursiveTravel(this.root);
	}
}
