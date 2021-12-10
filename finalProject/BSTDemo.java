package finalProject;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class BSTDemo {


	static BinarySearchTree bst = new BinarySearchTree();


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		int selection = 0;

		do {
			System.out.println("-------------------------");
			System.out.println("1 Build employee Database");
			System.out.println("2 Sort employee Database Lowest to Highest");
			System.out.println("3 Sorted employees Database Pay Highest to Lowest");
			System.out.println("4 Quit");
			System.out.println("-------------------------");
			System.out.println("Enter 1, 2 or 3: ");

			selection = input.nextInt();
			input.nextLine();

			if (selection == 1) {
				build();

			} else if (selection == 2) {
				bst.inOrderTraverse(bst.root, true);
				
			//linked list	
			}else if (selection == 3) {
				BSTNode[] nodes = bst.inOrderTraverse(bst.root, false);
				LinkedStack ls= new LinkedStack();
				
				//Add the employees
				for(int i = 0; i < 10 ;i++) {
					int salary = nodes[i].getSalary();
					ls.push(new Employee(salary, nodes[i].getUser()));
				}
				
				for(int i = 0; i < 10 ;i++) {
					Employee e = ls.pop();
					System.out.println(e.getSalary() + " " + e.getUser());
				}
				
				
			} else if (selection == 4) {
				System.exit(0);
			}
		} while (selection != 3);

	}



	// creates the tree's root node and then reads the CSV file
	// and adds one node to the tree per user listed in the file.
	public static void  build() {

		//Add nodes to your linked list by reading all records (rows) from the .csv file. When this step is done, your linked list should have 500 nodes.
		Scanner fileReader = null;
		try {
			fileReader = new Scanner( new File("src//finalProject//users.csv"));
			//			fileReader.useDelimiter(",");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while(fileReader.hasNextLine()) {

			String line = fileReader.nextLine();
			//System.out.println(line);

			//FILE IS READ IN WRONG //TODO

			String[] lines = line.split(",");


			//create a node

			// add the node to the linked list
			bst.insert(Integer.valueOf(lines[0]), lines[1]);
		}
		fileReader.close();


	}
}
