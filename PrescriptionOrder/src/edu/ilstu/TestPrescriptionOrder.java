/*
 * Created on: Oct 28, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Tests the PrescriptionOrder class
 *
 * @author Michael Carlson
 *
 */
public class TestPrescriptionOrder
{

	public static void main(String[] args)
	{
		// Creates a scanner
		Scanner input = new Scanner(System.in);

		// Creates strings to store inputed data
		String orderNumber;
		String pharmacy;
		String letter;

		// Creates the initial classes
		PrescriptionOrder prescriptionOrder1 = new PrescriptionOrder("1320335", "AMOXICILIN 500 MG CAPSULE",
				"CVS-Peoria", "Antibiotic");
		PrescriptionOrder prescriptionOrder2 = new PrescriptionOrder("5304689", "VITAMIN D2 1.25 MG CAPSULE",
				"CVS-Bloomington", "X");
		PrescriptionOrder prescriptionOrder3 = new PrescriptionOrder("1145059", "FLUCERVAX QUAD 0.5 ML SYRINGE",
				"CVS-Chicago", "Vaccine");

		// A do while loop that continues to cycle through until the user inputs the
		// quit sequence
		do
		{
			// Displays the input menu
			PrescriptionOrder.displayMenu();

			// Gets the menu selection from user
			letter = input.next().toUpperCase();
			while (!(letter.equals("L") || letter.equals("R") || letter.equals("T") || letter.equals("Q")))
			{
				System.out.println("Invalid Input, try again");
				PrescriptionOrder.displayMenu();
				letter = input.next().toUpperCase();
			}

			// Lists the prescriptions
			if (letter.equals("L"))
			{
				System.out.println(prescriptionOrder1.toString());
				System.out.println(prescriptionOrder2.toString());
				System.out.println(prescriptionOrder3.toString());
			}

			/*
			 * Refills prescription by asking for the prescription Number and then checking
			 * if it has available refills before refilling. If there are no refills or the
			 * prescription number was wrong, nothing will be done.
			 */
			else if (letter.equals("R"))
			{
				// Prompts the user
				System.out.println("What is the order number: ");
				orderNumber = input.next();

				// Checks if input is for the first prescription
				if (orderNumber.equals("1320335"))
				{
					// Checks if refills are available
					if (prescriptionOrder1.getRefillsAvailable() > 0)
					{
						// Refills and prints success
						prescriptionOrder1.refill();
						System.out.println("Refill Successful!");
					} else
					{
						// Prints if there are no refills
						System.out.println("Sorry, you have reached the maximum number of refulls for this order.");
					}
					// Checks if input is for second prescription
				} else if (orderNumber.equals("5304689"))
				{
					// Checks if refills are available
					if (prescriptionOrder2.getRefillsAvailable() > 0)
					{
						// Refills and prints success
						prescriptionOrder2.refill();
						System.out.println("Refill Successful!");
					} else
					{
						// Prints if there are no refills
						System.out.println("Sorry, you have reached the maximum number of refulls for this order.");
					}
					// Checks if input is for third prescription
				} else if (orderNumber.equals("1145059"))
				{
					// Checks if refills are available
					if (prescriptionOrder3.getRefillsAvailable() > 0)
					{
						// Refills and prints success
						prescriptionOrder3.refill();
						System.out.println("Refill Successful!");
					} else
					{
						// Prints if there are no refills
						System.out.println("Sorry, you have reached the maximum number of refills for this order.");
					}
				} else
				{
					// Prints if number entered did not equal a prescription
					System.out.println("Prescription unavailable, try again");
				}
				// Transfer sequence
			} else if (letter.equals("T"))
			{
				// Prompts the user for order and pharmacy
				System.out.println("For which order: ");
				orderNumber = input.next();
				System.out.println("To which pharmacy: ");
				pharmacy = input.next();
				// Checks all prescriptions and transfers to the correct pharmacy
				if (orderNumber.equals("1320335"))
				{
					prescriptionOrder1.transfer(pharmacy);
					System.out.println("Transfer Successful.");
				} else if (orderNumber.equals("5304689"))
				{
					prescriptionOrder2.transfer(pharmacy);
					System.out.println("Transfer Successful.");
				} else if (orderNumber.equals("1145059"))
				{
					prescriptionOrder3.transfer(pharmacy);
					System.out.println("Transfer Successful.");
				} else
				{
					// Prints if the prescription number does not match
					System.out.println("Transfer not Successful, prescription does not exist.");
				}

			}
			// Quit statement
		} while (!(letter.equals("Q")));

		if (letter.equals("Q"))
		{
			System.out.println("Goodbye!");
			input.close();
		}

	}
}
