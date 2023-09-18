/*
 * Created on: Oct 4, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Quiz 1
 *
 * @author Michael Carlson
 *
 */
public class Biggest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
		int biggestNumber;

		System.out.print("Please enter a number (999 to quit): ");
		number = input.nextInt();
		biggestNumber = number;

		while (number != 999)
		{
			System.out.print("Please enter a number (999 to quit): ");
			number = input.nextInt();
			if (number > biggestNumber && number != 999)
			{
				biggestNumber = number;
			}
		}

		System.out.println("The largest of you numbers was: " + biggestNumber);
		input.close();
	}

}
