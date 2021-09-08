package week2Part1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week2Part2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		float runningtotal = 0;
		int rowcount = 0;
		float fileAverage;

		File myFile = new File("C:\\Users\\mwikoffwitten\\Documents\\School\\CSIS2420\\Week2Part2.txt");
		Scanner fileReader = new Scanner (myFile);

		while(fileReader.hasNext()) {
			float number = fileReader.nextFloat();
			//add numbers together while reading them
			runningtotal += number;
			rowcount++;
		}
		fileReader.close();
		
		fileAverage = runningtotal / 6;
		System.out.printf("There were %d amount of rows. The total of all numbers was %,f and the average of that number is %,f.", rowcount, runningtotal, fileAverage);
	}
}