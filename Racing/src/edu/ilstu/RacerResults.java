/*
 * Created on: Sep 21, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Takes the name of three racers, creates a random number between 1 and 5000
 * for them, asks for the number of laps completed by each racer and then prints
 * a table. The table has their name, number, laps, miles, winnings, bonus, and
 * net winnings. After the table, the grand total miles, base winnings, bonus
 * winnings, and net winnings between all of the racers is printed.
 *
 * @author Michael Carlson
 *
 */
public class RacerResults
{

	public static void main(String[] args)
	{
		// Creates a scanner to read from the keyboard, and a random number generator
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		// Decimal formats for miles, and money
		DecimalFormat milesFormat = new DecimalFormat("0.#");
		DecimalFormat moneyFormat = new DecimalFormat("$###,##0.00");

		// Creates the constants that will be used in all calculations
		final double MILES_IN_LAP = 8.5;
		final double BONUS_MILES = 12.00;
		final double LAP_WINNINGS = 22.00;
		final double ENTRY_FEE = 100.00;

		// First racers information
		String racer1FirstName;
		String racer1LastName;
		int racer1Laps;
		int racer1Number = random.nextInt(5000) + 1;
		double racer1Miles;
		double racer1BaseWin;
		double racer1Bonus = 0;
		double racer1NetWin;

		// Second racers information
		String racer2FirstName;
		String racer2LastName;
		int racer2Laps;
		int racer2Number = random.nextInt(5000) + 1;
		double racer2Miles;
		double racer2BaseWin;
		double racer2Bonus = 0;
		double racer2NetWin;

		// Third racers information
		String racer3FirstName;
		String racer3LastName;
		int racer3Laps;
		int racer3Number = random.nextInt(5000) + 1;
		double racer3Miles;
		double racer3BaseWin;
		double racer3Bonus = 0;
		double racer3NetWin;

		// Prints the header
		System.out.println("Welcome to the Lone Survivor Endurance Race!" + "\n");

		// Gets the first racers name and laps
		System.out.print("Please enter the racer's first name: ");
		racer1FirstName = (input.next()).toLowerCase();
		System.out.print("Please enter the racer's last name: ");
		racer1LastName = (input.next()).toLowerCase();
		System.out.print("Please enter the number of laps completed: ");
		racer1Laps = input.nextInt();
		System.out.println();

		// Gets the second racers name and laps
		System.out.print("Please enter the racer's first name: ");
		racer2FirstName = (input.next()).toLowerCase();
		System.out.print("Please enter the racer's last name: ");
		racer2LastName = (input.next()).toLowerCase();
		System.out.print("Please enter the number of laps completed: ");
		racer2Laps = input.nextInt();
		System.out.println();

		// Gets the third racers name and laps
		System.out.print("Please enter the racer's first name: ");
		racer3FirstName = (input.next()).toLowerCase();
		System.out.print("Please enter the racer's last name: ");
		racer3LastName = (input.next()).toLowerCase();
		System.out.print("Please enter the number of laps completed: ");
		racer3Laps = input.nextInt();
		System.out.println();

		// Calculates the miles each racer did by multiplying the laps by the miles in a
		// lap
		racer1Miles = racer1Laps * MILES_IN_LAP;
		racer2Miles = racer2Laps * MILES_IN_LAP;
		racer3Miles = racer3Laps * MILES_IN_LAP;

		// Calculates the base winnings by multiplying the laps by the dollars given per
		// lap
		racer1BaseWin = racer1Laps * LAP_WINNINGS;
		racer2BaseWin = racer2Laps * LAP_WINNINGS;
		racer3BaseWin = racer3Laps * LAP_WINNINGS;

		/*
		 * If the racer had more than 50 miles, the bonus is calculated by taking the
		 * miles over 50 and multiplying them by the dollars per bonus miles
		 */
		if (racer1Miles > 50)
		{
			racer1Bonus = (racer1Miles - 50) * BONUS_MILES;
		}

		if (racer2Miles > 50)
		{
			racer2Bonus = (racer2Miles - 50) * BONUS_MILES;
		}

		if (racer3Miles > 50)
		{
			racer3Bonus = (racer3Miles - 50) * BONUS_MILES;
		}

		/*
		 * Calculates the net total by adding the base winnings, the bonuses, and
		 * subtracting the entry fee
		 */
		racer1NetWin = racer1BaseWin + racer1Bonus - ENTRY_FEE;
		racer2NetWin = racer2BaseWin + racer2Bonus - ENTRY_FEE;
		racer3NetWin = racer3BaseWin + racer3Bonus - ENTRY_FEE;

		// Table header
		System.out.println("Lone Survivor Endurance Race Results \n");
		System.out.println("Bib#  Name            Laps   Miles   Base Winnings   Bonus   Net Winnings");
		System.out.println("-------------------------------------------------------------------------");

		// Prints the information of the racers with a tab between the data
		System.out.println(racer1Number + " " + racer1FirstName + " " + racer1LastName + "\t" + racer1Laps + "\t"
				+ milesFormat.format(racer1Miles) + "\t" + moneyFormat.format(racer1BaseWin) + "\t"
				+ moneyFormat.format(racer1Bonus) + "\t" + moneyFormat.format(racer1NetWin));

		System.out.println(racer2Number + " " + racer2FirstName + " " + racer2LastName + "\t" + racer2Laps + "\t"
				+ milesFormat.format(racer2Miles) + "\t" + moneyFormat.format(racer2BaseWin) + "\t"
				+ moneyFormat.format(racer2Bonus) + "\t" + moneyFormat.format(racer2NetWin));

		System.out.println(racer3Number + " " + racer3FirstName + " " + racer3LastName + "\t" + racer3Laps + "\t"
				+ milesFormat.format(racer3Miles) + "\t" + moneyFormat.format(racer3BaseWin) + "\t"
				+ moneyFormat.format(racer3Bonus) + "\t" + moneyFormat.format(racer3NetWin));

		// Prints the collective information between all the racers
		System.out
				.println("\n" + "Total Miles Covered: " + milesFormat.format(racer1Miles + racer2Miles + racer3Miles));
		System.out.println("Total Base Winnings: " + moneyFormat.format(racer1BaseWin + racer2BaseWin + racer3BaseWin));
		System.out.println("Total Bonus Winnings: " + moneyFormat.format(racer1Bonus + racer2Bonus + racer3Bonus));
		System.out.println("Total Net Winnings: " + moneyFormat.format(racer1NetWin + racer2NetWin + racer3NetWin));

		// Close the scanner
		input.close();
	}

}
