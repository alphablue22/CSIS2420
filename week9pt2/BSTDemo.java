package week9pt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BSTDemo {


	static BinarySearchTree bst = new BinarySearchTree();


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		int selection = 0;

		do {
			System.out.println("-------------------------");
			System.out.println("1 Build Users Tree");
			System.out.println("2 Find by IP Address");
			System.out.println("3 Find by Username");
			System.out.println("4 Report Number of Nodes");
			System.out.println("5 Print Entire Tree");
			System.out.println("6 Exit");
			System.out.println("-------------------------");
			System.out.println("Enter 1, 2, 3, 4, 5 or 6: ");

			selection = input.nextInt();
			input.nextLine();

			if (selection == 1) {
				build();

			} else if (selection == 2) {
				System.out.println("Please give ip address last 3 digits: ");
				String ipString = input.nextLine();
				int ip = Integer.parseInt(ipString);
				bst.searchIP(ip);
				
			} else if (selection == 3) {
				System.out.println(" What is the username?: ");
				String userName = input.nextLine();
				bst.searchUser(userName);
			} else if (selection == 4) {
				System.out.println("Number of Nodes: "+ bst.getCount());
			} else if (selection == 5) {
				bst.inOrderTraverse(bst.root);
				
			} else if (selection == 6) {
				System.exit(0);
			}
		} while (selection != 6);

	}



	// creates the tree's root node and then reads the CSV file
	// and adds one node to the tree per user listed in the file.
	public static void  build() {

		//Add nodes to your linked list by reading all records (rows) from the .csv file. When this step is done, your linked list should have 500 nodes.
		Scanner fileReader = null;
		try {
			fileReader = new Scanner( new File("src//week9pt2//users.csv"));
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
