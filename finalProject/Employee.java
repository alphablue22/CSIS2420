package finalProject;

public class Employee {

	private int salary;

	/**
	 * @param salary
	 * @param user
	 */
	public Employee(int salary, String user) {
		this.salary = salary;
		this.user = user;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	private String user;

}
