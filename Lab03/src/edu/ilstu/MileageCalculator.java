/*
 * Created on: Sep 6, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Takes the gallons used, the miles driven, and calculates the miles per gallon
 *
 * @author Michael Carlson
 *
 */
public class MileageCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Makes a new scanner to read the keyboard
		Scanner keyboard = new Scanner(System.in);

		// Makes 3 variables to store the gallons used, the miles driven, and the mpg to
		// be outputed
		int gallonsUsed;
		int milesDriven;
		double milesPerGallon;

		// Asks the user for the number of gallons used by reading the keyboard
		System.out.println("Hello");
		System.out.println("I will calculate the miles per gallon for you.");
		System.out.print("Enter gallons of gas used: ");
		gallonsUsed = keyboard.nextInt();

		// Asks the user for the number of miles driven by reading the keyboard
		System.out.print("Enter miles driven: ");
		milesDriven = keyboard.nextInt();

		// Divides the miles driven by the gallons used and stores the number in the
		// variable "milesPerGallon" which is outputed a line later
		milesPerGallon = (double) milesDriven / gallonsUsed;
		System.out.print("The miles per gallon is: " + milesPerGallon);

	}

}
