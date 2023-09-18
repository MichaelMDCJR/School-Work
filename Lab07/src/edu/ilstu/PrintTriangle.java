/*
 * Created on: Oct 4, 2022
 *
 * ULID: mdcarl2
 * ULID: Ktbark1
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/*
 * Makes a triangle of stars based on a number inputed by the user
 * 
 * @author Michael Carlson and Keeton Barker
 */

public class PrintTriangle
{

	public static void main(String[] args)
	{
		// Create the Scanner
		Scanner scan = new Scanner(System.in);

		// Create the following variables, Integer, counter, and stars
		int integer;
		int counter;
		int stars;

		// Ask the user for a number between 3 and 40, re-prompting them if the number
		// is not
		do
		{
			System.out.println(" Please enter a number bewteen 3 and 40");
			integer = scan.nextInt();
		} while (integer < 3 || integer > 40);

		// Counts how many lines are needed for stars
		for (counter = 0; counter <= integer; counter++)
		{
			// Counts how many stars are per line
			for (stars = 1; stars <= counter; stars++)
			{
				// print the ("*") statement the amount of times the counter equals.
				System.out.print("*");
			}
			// Makes a new line for the next line of stars
			System.out.println();
		}

		// Closes the scanner
		scan.close();
	}

}
