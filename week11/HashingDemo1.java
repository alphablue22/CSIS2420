package week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * HashingDemo1t.java - Class to demonstrate hash tables.
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedHashing.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 */

public class HashingDemo1
{
	static int nanoDivisor = 1000000000;
	
	Scanner input = new Scanner(System.in);
	/*
		hashArray[0] -> Barnes 
		hashArray[1] -> Andrews -> Mathison -> Jones
		hashArray[2] -> Yates   -> Carlson
	 */
	public static String[] dataArray = new String[] {"Yates","Andrews","Barnes","Mathison","Jones","Carlson"};
	public static int[] customerIDsArray = new int[] {1111, 2222, 3333, 4444, 5555, 6666};
	public static HashNode hashArray[] = new HashNode[100];

	public static void main(String[] args)
	{
		//displayDataArray();
		//displayHashExampleOutput();
		//for (int j = 0; j < dataArray.length; j++)
		//{
		//	appendNode(hashIt(dataArray[j]), customerIDsArray[j], dataArray[j]);
		//}
		build();
		long start = System.nanoTime();
		
		displayHashArray();
		
		long end = System.nanoTime();
		long duration = end - start;
		double seconds = (double)duration/nanoDivisor;
		System.out.printf("%nDuration: %,d nanoseconds [%.10f seconds]%n", duration, seconds);
		
		//test this with any name part 1
		HashNode result = Search("Worth");
		if (result == null) {
			System.out.println("The node doesn't exist");
		}else {
			System.out.println(result.customerID + " " + result.lastName);
		}
	}

	private static void displayHashExampleOutput() 
	{
		int asciiTotal = 0;
		for (int j = 0; j < dataArray.length; j++)
		{
			for (int k = 0; k < dataArray[j].length(); k++)
			{
				char c = dataArray[j].charAt(k);
				System.out.println(c + "  " + (int)c);
				asciiTotal = asciiTotal + (int)c;
			}
			System.out.print("asciiTotal: " + asciiTotal);
			System.out.println("\t[" + asciiTotal % hashArray.length + "]\n");
			asciiTotal = 0;
		}
	}

	private static void displayDataArray() 
	{
		for (int i = 0; i < dataArray.length; i++)
		{
			System.out.printf("dataArray[%d]: %s%n", i, dataArray[i]);
		}
		System.out.println();
		for (int i = 0; i < customerIDsArray.length; i++)
		{
			System.out.printf("customerIDsArray[%d]: %s%n", i, customerIDsArray[i]);
		}
		System.out.println();
	}

	public static int hashIt(String data)
	{
		int asciiTotal = 0;
		for (int n = 0; n < data.length(); n++)
		{
			char c = data.charAt(n);
			asciiTotal = asciiTotal + (int)c;
		}
		return asciiTotal % hashArray.length;
	}

	public static void appendNode(int arrayIndex, int customerID, String name)
	{
		if (hashArray[arrayIndex] == null)
		{
			hashArray[arrayIndex] = new HashNode(customerID, name);
		}
		else
		{
			HashNode current = hashArray[arrayIndex];
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new HashNode(customerID, name);
		}
	}

	public static void displayHashArray()
	{
		for (int i = 0; i < hashArray.length; i++)
		{
			System.out.printf("hashArray[%d]", i);
			if (hashArray[i] != null)
			{
				HashNode current = hashArray[i];
				System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				while (current.next != null)
				{
					current = current.next;
					System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				}
			}
			System.out.println();;
		}
	}

	//create search method takes in a string and converts it to ascii
	public static HashNode Search(String lastName) {
		int index = hashIt(lastName);
		HashNode current = hashArray[index];
		
		while (current != null)
		{
			if(current.lastName.equals(lastName)) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	//compares that with the linked lists and locates the index from the modulus
	//if found returns the pointer
	//prints the customer ID and name

	public static void  build() {

		//Add nodes to your linked list by reading all records (rows) from the .csv file. When this step is done, your linked list should have 500 nodes.
		Scanner fileReader = null;
		try {
			fileReader = new Scanner( new File("src//week11//HashingDemoDataFile.csv"));
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
			appendNode(hashIt(lines[1]), Integer.valueOf(lines[0]), lines[1]);
		}
		fileReader.close();


	}
	
}
