/*
 * Created on: Nov 1, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 * ULID: DJPANOZ
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Program that experiments with arrays, like adding and multiplying array
 * values, and printing those values when the original array is larger
 *
 * @author Michael Carlson and Dominick Panozzo
 *
 */
public class ArrayFun
{

	public static void main(String[] args)
	{
		// Creates a scanner
		Scanner input = new Scanner(System.in);
		// Creates an array, an int to track the number of values in the array, and a
		// factor to be inputted by the user.
		int[] myArray = new int[100];
		int validValues = fillArray(myArray, input);
		int factor;

		// Prints the number of imputs submitted into the array
		System.out.println("Total inputs: " + validValues);

		// Prints the product of all array values
		System.out.println("The product of the array with valid values: " + computeProduct(myArray, validValues));

		// Prompts the user for a factor and stores that factor in an int
		System.out.println("Enter integer factor: ");
		factor = input.nextInt();

		// Prints the number of array values that have a factor sumbmitted by the user
		System.out.println(
				"The number of values with their respected factor: " + countMultiples(myArray, validValues, factor));

		// Prints all of the values inside the array
		System.out.println("Printing an array with its valid values: ");
		printArray(myArray, validValues);
	}

	/*
	 * Creates an array by asking the user for every value, until the user enters
	 * the sentianl value (-999). It also tracks how many values are inside the
	 * array with a counter.
	 */
	/**
	 * Constructor
	 * 
	 * @param array Array given by user
	 * @param input Scanner to read keyboard
	 * @return counter How many times while loop ran
	 */
	public static int fillArray(int[] array, Scanner input)
	{
		int counter = 0;
		System.out.print("Enter number for array: ");
		int number = input.nextInt();
		while (number != -999 && (counter <= 100))
		{
			array[counter] = number;
			counter++;
			System.out.print("Enter number for array: ");
			number = input.nextInt();
		}
		return counter;

	}

	// Takes an array and finds the product of all values using a looping for loop
	/**
	 * @param array Array inputed by user
	 * @param myInt An int that represents how many times to run the loop
	 * @return sum The sum of all the array values
	 */
	public static int computeProduct(int[] array, int myInt)
	{
		int sum = 1;
		for (int i = 0; i < myInt; i++)
		{
			sum = array[i] * sum;
		}
		return sum;
	}

	/*
	 * Takes an array, the number of values in the array, and a factor inputted by
	 * the user, and finds how many values are divisiable by said factor with the
	 * modulus operator.
	 */
	/**
	 * @param array  An array submitted by the user
	 * @param myInt  And int that regulates how many tiems the for loop runs
	 * @param factor The factor given by the user
	 * @return sum The amount of array values that have the given factor
	 */
	public static int countMultiples(int[] array, int myInt, int factor)
	{
		int sum = 0;
		for (int i = 0; i < myInt; i++)
		{
			if ((array[i] % factor) == 0)
			{
				sum = sum + 1;
			}
		}
		return sum;
	}

	// Prints every value in the array to the console using a for loop
	/**
	 * @param array       The array given by the user
	 * @param validValues The int that regulates how many times the loop runs
	 */
	public static void printArray(int[] array, int validValues)
	{
		for (int i = 0; i < validValues; i++)
		{
			System.out.println(array[i]);
		}

	}

}
