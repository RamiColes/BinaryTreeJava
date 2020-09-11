
public class Main {

	public static void main(String[] args) {
		System.out.println("==============START TEST==============");
		BinaryTree tree = new BinaryTree(8);
		System.out.println("==============TEST 1==============");
		tree.travel();
		System.out.println("==============TEST 2==============");
		tree.insertNode(5);
		tree.insertNode(6);
		tree.insertNode(10);
		tree.insertNode(8);
		tree.travel();
		System.out.println("===============END TEST===============");
	}

}
