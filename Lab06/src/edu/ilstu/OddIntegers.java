/*
 * Created on: Sep 27, 2022
 *
 * ULID: mdcarl2
 * ULID: lrbenn1
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Prints out a increasing line off odd numbers based on the users input, and
 * adds them all together
 *
 * @author Michael Carlson & Logan Bennett
 *
 */
public class OddIntegers
{

	public static void main(String[] args)
	{
		// Creates a scanner to read the keyboard and prompts the user for their number
		Scanner input = new Scanner(System.in);
		System.out.println("How many odd integers do you want to add?: ");
		int number = input.nextInt();

		// Creates variables to store the sum of the added numbers
		int sum = 1;

		// Creates a variable to count up in the while loop
		int counter = 1;

		// Creates a place to store the final sum of the numbers
		int totalSum = 1;

		// Prints 1, the first odd number
		System.out.print(sum);

		// Loops through, printing odd numbers and adding them together until it reaches
		// the counter set by the user
		while (counter != number)
		{
			sum = sum + 2;
			counter++;
			System.out.print(" + " + sum);
			totalSum = sum + totalSum;
		}

		// Prints the final value
		System.out.print(" = " + totalSum);

		// Close the scanner
		input.close();
	}

}
