
public class Main {

	public static void main(String[] args) {
		System.out.println("==============START TEST==============");
		BinaryTree tree = new BinaryTree(8); //Creation of binary tree
		tree.travel();
		
		System.out.println("==============TEST 2=============="); // We will add a few values in the tree to see if they are inserted correctly.
		tree.insertNode(5);
		tree.insertNode(6);
		tree.insertNode(10);
		tree.insertNode(8);
		tree.travel(); //Prints all the values in the tree.
		/*
		 * Looking into the debugger, I have found that all the nodes are inserted correctly.
		 * TODO : Pretty print that shows arborescence of tree.
		 */
		System.out.println("===============END TEST===============");
	}

}
