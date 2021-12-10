package finalProject;

public class BSTNode 
{

	private int salary;
	BSTNode left;
	BSTNode right;
	private String User;

	public BSTNode(int salary, String User) 
	{
		this.salary = salary;
		this.User = User;
	}

	@Override
	public String toString() {
		return salary + ", " + User ;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @return the left
	 */
	public BSTNode getLeft() {
		return left;
	}

	/**
	 * @return the right
	 */
	public BSTNode getRight() {
		return right;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return User;
	}
	
	
	
}

