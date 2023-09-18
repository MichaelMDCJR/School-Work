/*
 * Created on: Sep 13, 2022
 *
 * ULID: mdcarl2
 * ULID: lrbenn1
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Takes seconds inputed by user and gives back the # of hours, minutes, and
 * seconds.
 *
 * @author Michael Carlson and Logan Bennett
 *
 */
public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Constants used in calculations
		final int SECONDSINMIN = 60;
		final int SECONDSINHOUR = 3600;

		// Variables used to store and print calculated information
		int userSeconds;
		int hours;
		int minutes;
		int seconds;

		// Makes a scanner to take user input
		Scanner userInput = new Scanner(System.in);

		// Asks a user to input seconds, and stores it in userSeconds
		System.out.println("How many seconds are there?: ");
		userSeconds = userInput.nextInt();

		/*
		 * Calculates the hours by taking the inputed seconds and divides it by the
		 * number of seconds in an hour. Because it is an Int, the decimal gets dropped
		 */
		hours = userSeconds / SECONDSINHOUR;

		/*
		 * Calculates the minutes by taking the inputed seconds, divides it by the
		 * number of seconds in a minutes and then subtracting that from the minutes
		 * already used when calculating the hours
		 */
		minutes = userSeconds / SECONDSINMIN - hours * SECONDSINMIN;

		/*
		 * Calculates the seconds by taking the remainder of the inputed seconds by the
		 * number of seconds in a minute
		 */
		seconds = userSeconds % SECONDSINMIN;

		// Closes the scanner
		userInput.close();

		// Prints the hours, minutes, and seconds
		System.out.println("Here are the results: ");
		System.out.println("Number of Hours: " + hours);
		System.out.println("Number of Minutes: " + minutes);
		System.out.println("Number of Seconds: " + seconds);

	}

}
