package algoTesting;

import java.util.Random;

public class LinearSearch
{
	public static void main(String[] args)
	{


		int min = 10000;
		int max = 99999;
		int numElements = 1000000;
		Random rand = new Random();
		int dataArray[] = new int[numElements];
		for (int i = 0; i < dataArray.length; i++)
		{
			dataArray[i] = (rand.nextInt((max - min) + 1) + min);
		}


		//Add a memory consumption calculation and store it in a variable.
		long memoryConsumption = (4 * dataArray.length) + 24 + 8;

		int searchValue = 34;
		int result = linearSearch(dataArray, searchValue);
		
		
		//Add code to count the number of comparisons made to find the search value in the array.
		//int comparisonCount = dataArray.length;
		
		/* if (result > -1)
		{
			System.out.println("The value " + searchValue +
					" was found at array index " + result);
		}
		else
		{
			System.out.println("The value " + searchValue +
					" was not found in the array. There were " + comparisonCount +" comparisons.");
		}
		*/
		System.out.println(numElements +" elements: " + result +" comparisons");
		
	}

	static int linearSearch(int searchArray[], int seekValue)
	{
		int comparisonCount = 0;

		for (int i = 0; i < searchArray.length; i++)
		{
			comparisonCount++;
			
			if (searchArray[i] == seekValue) 

				return comparisonCount;
		}
		return comparisonCount;
	}

}


