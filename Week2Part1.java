package week2Part1;

import java.util.Scanner;

public class Week2Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare Variables.
		int min;
		int max;
		int total = 0;
		int sumRow = 0;
		int highestrow = 0;
		int highestrownumber = 1;

		//new scanner
		Scanner input = new Scanner(System.in);

		//Asks user for min and max values and records the int values.
		System.out.println("Please enter a minimum value:");
		min = input.nextInt();
		System.out.println("Please enter a maximum value:");
		max = input.nextInt();

		//Write a for loop that sums all of the integers from min to max into total.
		for(int i = min; i<=max; i++) {
			if (total == 0){
				total = min;
			}else
				total = total + i;
		}//end for loop

		System.out.printf("Here is a total from the minimum to maximum value %,d\n\n" , total);

		//two dimensional array that contains the game scores
		int[][] gameScores = new int[][]
				{
			{44,63,45,23,76,45},
			{76,23,56,98,33,24},
			{23,71,92,39,45,44},
			{70,20,46,64,77,29},
			{83,45,99,20,10,21},
			{86,34,92,34,88,11}
				};

				//Calculates number of rows and columns present in given matrix  
				int rows = gameScores.length;
				int cols = gameScores[0].length;  

				System.out.println("----------------------");
				System.out.println("Total Scores");
				System.out.println("----------------------");
				//Write a nested-for loop that summarizes the gameScores array and provides the total score for each row.
				for(int i = 0; i < rows; i++){  
					sumRow = 0;  
					for(int j = 0; j < cols; j++){  
						sumRow = sumRow + gameScores[i][j];
						//capture the highest row
						
					}  
					if(sumRow > highestrow) {
						highestrow = sumRow;
						highestrownumber++;
					}
					System.out.println("Row " + (i+1) +": " + sumRow);  
				}  

				System.out.println("----------------------");
				System.out.printf("High Score: %d\n", highestrownumber);
				System.out.println("----------------------");


	}//end main method
}//end class
