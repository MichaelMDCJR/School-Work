/*
 * Created on: Sep 27, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168
 * ULID: lrbenn1  
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Takes the price of an item between 25c and 100c, and returns the change based
 * on how much it cost
 *
 * @author Michael Carlson and Logan Bennett (genuises!)
 *
 */
public class ChangeMaker
{

	public static void main(String[] args)
	{

		// Creates a scanner for user input
		Scanner input = new Scanner(System.in);

		// Asks user to enter amount of $, must be in 5-cent increments
		System.out.println("Item price must be 25 cents to a dollar, in 5-cent increments. ");
		System.out.print("Enter item cost: ");
		// Variables for cost, change, quarters, dimes, and nickels
		int cost = input.nextInt();
		int change = 100 - cost;
		int quarters;
		int dimes;
		int nickels;

		/*
		 * Prints out what your change will be. If the change is greater than 100 or
		 * less than 25, it will not print the change (error). Also, if it is not
		 * divisible by 5, it will also be an error. Finally, if change is = to 100, it
		 * will just be 1 dollar in change
		 */
		System.out.println("Your change will be: " + change);
		if (change > 100)
		{
			System.out.println("Error: change is over 100");
		}
		if (change < 25)
		{
			System.out.println("Error: change is less than 25");
		}
		if ((change % 5) != 0)
		{
			System.out.println("Error: change is not a multiple of 5");
		}
		if (change == 100)
		{
			System.out.println("Change is 1 dollar");
		}

		// The math for converting quarters, dimes, and nickels
		quarters = change / 25;
		change = change - (quarters * 25);
		dimes = change / 10;
		change = change - (dimes * 10);
		nickels = change / 5;
		change = change - (nickels * 5);

		// Prints out the remaining change results, showing how many quarter(s),
		// dime(s), or nickel(s) you have left
		System.out.println("Here are the results");

		if (quarters == 1)
		{
			System.out.println(quarters + " Quarter");
		} else if (quarters > 1)
		{
			System.out.println(quarters + " Quarters");
		}

		if (dimes == 1)
		{

			System.out.println(dimes + " Dime");
		}

		else if (dimes > 1)
		{

			System.out.println(dimes + " Dimes");
		}

		if (nickels == 1)
		{

			System.out.println(nickels + " Nickel");
		}

		else if (nickels > 1)
		{
			System.out.println(nickels + "Nickels");
		}

		// Closes the scanner!
		input.close();
	}

}
