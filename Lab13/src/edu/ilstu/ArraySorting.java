package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program that works with arrays of integers including sorting and merging
 * sorted arrays
 * 
 * @author Mary Elaine Califf and Michael Carlson ULID: mdcarl2
 *
 */
public class ArraySorting
{

	/**
	 * Reads a file and stores the data in an array
	 * 
	 * @param theArray      Array to be filled
	 * @param inputFileName File with data to be read
	 * @return the number of values in the array
	 */
	public static int readArray(int[] theArray, String inputFileName)
	{
		// read the contents of the specified file into theArray and return the number
		// of elements read
		// you may assume that the array will be big enough
		// you must handle relevant exceptions

		try
		{
			// Makes a counter to loop through the array and store how many values it has
			int counter = 0;
			// Makes a scanner to read from the file
			Scanner scan = new Scanner(new File(inputFileName));

			// If there is data to read, read it, store it in an array, and then increment
			while (scan.hasNext())
			{
				theArray[counter] = scan.nextInt();
				counter++;
			}

			// Return number of values in array
			return (counter);
		}
		// If no file is found, print error message
		catch (FileNotFoundException e)
		{
			System.out.println("No file found");
			return 0;
		}

		// If wrong data is in file, print error message
		catch (InputMismatchException e)
		{
			System.out.println("Data type other than integer in file.");
			return 0;
		}

	}

	/**
	 * Writes a given amount of values from a given array to a given file.
	 * 
	 * @param theArray       The array data is read from
	 * @param numValues      The amount of values to read
	 * @param outputFileName The place to store the read data
	 */
	public static void writeArray(int[] theArray, int numValues, String outputFileName)
	{
		// write the first numValues elements of theArray to the specified file
		// you must handle relevant exceptions
		try
		{
			// Creates a printwriter to write to a given file
			PrintWriter output = new PrintWriter(new FileWriter(outputFileName, false));

			// Loop through the array, printing its values to the file
			for (int i = 0; i < numValues; i++)
			{
				output.println(theArray[i]);
			}
			// Close the file
			output.close();
		}
		// Prints error message
		catch (IOException e)
		{
			System.out.println("Error");
		}

	}

	/**
	 * Sorts an array using selection sort
	 * 
	 * @param theArray  Array to be sorted
	 * @param numValues Number of values in array
	 */
	public static void selectionSort(int[] theArray, int numValues)
	{
		// sort the first numValue elements of theArray using the selection sort
		// algorithm

		// Variables to store the index of the lowest and also said value
		int currentLowest;
		int indexOfLow;

		/*
		 * Start a loop, setting the indexOfLow to the current value before looping
		 * through the array. If a new lower value is found, set it as the new
		 * indexOfLow. Get the value stored at the lowest position and switch it with
		 * the original value.
		 */
		for (int i = 0; i < numValues; i++)
		{
			indexOfLow = i;
			for (int j = i + 1; j < numValues; j++)
			{
				if (theArray[j] < theArray[indexOfLow])
				{
					indexOfLow = j;
				}
			}
			currentLowest = theArray[indexOfLow];
			theArray[indexOfLow] = theArray[i];
			theArray[i] = currentLowest;
		}
	}

	/**
	 * Takes two sorted arrays, and merge sorts them into one array
	 * 
	 * @param arr1      First array to be merged
	 * @param size1     Size of first array
	 * @param arr2      Second array to be merged
	 * @param size2     Size of second array
	 * @param mergedArr Array where merged values will be stored
	 * @return Returns the size of the merged array
	 */
	public static int mergeArrays(int[] arr1, int size1, int[] arr2, int size2, int[] mergedArr)
	{
		// Index counters for each array
		int counter = 0;
		int array1Count = 0;
		int array2Count = 0;

		/*
		 * While both arrays still have values to loop through, check if the value of
		 * array1 at array1Count is smaller than array2 at array2Count. If yes, set the
		 * value of the merged array to the value in array1 and increment its counter.
		 * If not, do the same except for array2. Finally, add 1 to the merged index
		 * counter.
		 */
		while (array1Count < size1 && array2Count < size2)
		{
			if (arr1[array1Count] <= arr2[array2Count])
			{
				mergedArr[counter] = arr1[array1Count];
				array1Count++;
			} else
			{
				mergedArr[counter] = arr2[array2Count];
				array2Count++;
			}
			counter++;
		}
		/*
		 * If array 1 or 2 runs out of values, send the rest of the opposites array's
		 * values to the merged array
		 */
		while (array1Count < size1)
		{
			mergedArr[counter] = arr1[array1Count];
			counter++;
			array1Count++;
		}
		while (array2Count < size2)
		{
			mergedArr[counter] = arr2[array2Count];
			counter++;
			array2Count++;
		}
		// Return how many values are in merged array
		return counter;
	}

	public static void main(String[] args)
	{
		// Test just the reading and writing -- check contents of numbersout.txt
		int[] array1 = new int[100];
		int numElems1 = readArray(array1, "numbers.txt");
		writeArray(array1, numElems1, "numbersout.txt");

		// Test the sorting -- check contents of sortedout.txt
		selectionSort(array1, numElems1);
		writeArray(array1, numElems1, "sortedout.txt");

		// Read second array and test merging -- check contents of mergedout.txt
		int[] array2 = new int[100];
		int numElems2 = readArray(array2, "numbers2.txt");
		int[] array3 = new int[200];
		int numElems3 = mergeArrays(array1, numElems1, array2, numElems2, array3);
		writeArray(array3, numElems3, "mergedout.txt");

	}

}
