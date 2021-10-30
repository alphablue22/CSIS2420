package week9pt2;

//public class BinarySearchTree {
public class BinarySearchTree {
	public BSTNode root;
	private static int count = 0;


	public void insert(int IP, String User) {
		count++;
		BSTNode newNode = new BSTNode(IP, User);
		if (root == null) {
			root = newNode;
			return;
		} else {
			BSTNode current = root, parent = null;
			while (true) {
				parent = current;
				if (IP < current.IP) {
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

	public void inOrderTraverse(BSTNode n) {
		if (root == null) {

			System.out.println("Tree is empty");

		} else {
			if (n.left != null) {
				inOrderTraverse(n.left);
			}
			System.out.println(n);

			if (n.right != null) {
				inOrderTraverse(n.right);
			}
		}
	}

	public void searchIP(int IP) {

		if (root == null) {
			System.out.println("Tree is empty");	
		}
		else {
			BSTNode result = searchIP(root, IP);
			if (result == null) {
				System.out.println("Not found");}
			else{
				System.out.println("found");
			}
		}
	}

	// recursive search function
	public BSTNode searchIP(BSTNode n, int IP) {

		if (n.left != null && searchIP(n.left, IP) != null) {

			return searchIP(n.left, IP);
		}

		else if(n.right != null && searchIP(n.right, IP) != null) {

			return searchIP(n.right, IP);
		}else if(n.IP == IP) {

			return n;

		}else {
			return null;
		}
	}


	public void searchUser(String User) {

		if (root == null) {
			System.out.println("Tree is empty");	
		}
		else {
			BSTNode result = searchUser(root, User);
			if (result == null) {
				System.out.println("Not found");}
			else{
				System.out.println("found");
			}
		}
	}

	// recursive search function
	public BSTNode searchUser(BSTNode n, String User) {

		if (n.left != null && searchUser(n.left, User) != null) {

			return searchUser(n.left, User);
		}

		else if(n.right != null && searchUser(n.right, User) != null) {

			return searchUser(n.right, User);
		}else if(n.User.equals(User)) {

			return n;

		}else {
			return null;
		}
	}


	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
}