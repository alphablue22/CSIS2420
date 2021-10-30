package week9pt2;


public class BSTNode 
{

	int IP;
	BSTNode left;
	BSTNode right;
	String User;

	public BSTNode(int IP, String User) 
	{
		this.IP = IP;
		this.User = User;
	}

	@Override
	public String toString() {
		return IP + ", " + User ;
	}
	
	
}
