package algoTesting;

import java.util.Arrays;
import java.util.Random;

class BinarySearch
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
		Arrays.sort(dataArray);
		

		//Add a memory consumption calculation and store it in a variable.
		long memoryConsumption = (4 * dataArray.length) + 24 + 8;

		int searchValue = 22;
		int result = binarySearch(dataArray, searchValue);
		
		/*
		if (result > -1)
		{
			System.out.println("The value " + searchValue +
					" was found at array index " + result);
		}
		else
		{
			System.out.println("The value " + searchValue +
					" was not found in the array.");
		}
		*/
		
		System.out.println(numElements +" elements: " + result +" comparisons");
	}

	static int binarySearch(int searchArray[], int seekValue)
	{	
		int comparisonCount = 0;
		int low = 0;
		int high = searchArray.length - 1;
		while (low <= high) {
			
			comparisonCount++;
			int mid = low + (high- low) / 2;
			if (searchArray[mid] == seekValue)
				return comparisonCount;
			if (searchArray[mid] < seekValue)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return comparisonCount;
	}

}