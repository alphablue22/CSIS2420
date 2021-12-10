package finalProject;

public class LinkedStack {

	// size of stack
	private int size;
	private node head;

	private class node {
		private node next;
		private Employee e;
		
		public node(Employee e) {
			this.e = e;
		}

	}

	public LinkedStack(){
		head = null;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if (head == null) {
			return true;
		}
		else 
			return false;
	}
	
	public void push(Employee e) {
		node old = head;
		head = new node(e); 
		head.next = old;
		size++;
	}
	
	public Employee pop() {
		if (!isEmpty()) {
			Employee e = head.e;
			head = head.next;
			size--;
			return e;
		}else
			return null;
	}
}
