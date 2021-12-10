package finalProject;

//public class BinarySearchTree {
public class BinarySearchTree {
	public BSTNode root;
	private BSTNode[] array = new BSTNode[11];
	private int index = 0;

	public void insert(int salary, String User) {

		BSTNode newNode = new BSTNode(salary, User);
		if (root == null) {
			root = newNode;
			return;
		} else {
			BSTNode current = root, parent = null;
			while (true) {
				parent = current;
				if (salary < current.getSalary()) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public BSTNode[] inOrderTraverse(BSTNode n, boolean print) {

		

		if (root == null) {
			
			if(print)
				System.out.println("Tree is empty");

		} else {
			if (n.left != null) {
				inOrderTraverse(n.left, print);
			}
			if (print)
				System.out.println(n);
			array[index] = new BSTNode(n.getSalary(),n.getUser());
			index += 1;
			if (n.right != null) {
				inOrderTraverse(n.right, print);
			}
		}
		return array;
	}

}
