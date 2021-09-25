package week4;

public class LinkedList
{
	Node head;

	public void append(int data)
	{
		if (head == null)
		{
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null)
		{
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void printList()
	{
		Node current = head;
		System.out.print("List Contents: ");
		while (current != null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}


	public void Prepend(int data) 
	{	
		//if its empty
		if (head == null)
		{
			//creates a new node and the data value is stored in that node
			head = new Node(data);
			return;
		}

		//creates a new nodes object called newNode
		Node newNode = new Node(data);

		//pointer newNode = value at pointer head
		newNode.next = head;

		//pointer head = value at newNode
		head = newNode;


	}

	public void Delete(int data) 
	{
		//creating pointer current that points to head
		Node current = head;

		//iterates through the list while doesn't equal null
		while (current.next != null)
		{


			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}

			current = current.next;

		}

		System.out.println("Value is not in linked list and cannot be deleted");
	}

	public void Search(int data) 
	{
		//creating pointer current that points to head
		Node current = head;

		//iterates through the list while doesn't equal null
		while (current.next != null)
		{


			if (current.next.data == data) {
				System.out.println("The Value was found");
				return;
			}

			current = current.next;

		}

		System.out.println("The Value was not found");
	}

	public void Length() 
	{
		int counter = 0;
		
		//creating pointer current that points to head
				Node current = head;

				//iterates through the list while doesn't equal null
				while (current.next != null) {
					counter++;
					current = current.next;
				}
				System.out.println("there are " + counter + " nodes");
	}

}