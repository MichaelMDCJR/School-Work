/*
 * Created on: Sep 13, 2022
 *
 * ULID: mdcarl2
 * ULID: lrbenn1
 * 
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Michael Carlson and Logan Bennett
 *
 */
public class Payroll
{

	public static void main(String[] args)
	{

		// Opens a scanner to read the keyboard for information
		Scanner sc = new Scanner(System.in);

		// Creates a tool to format Employee pay based on the country
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		// Creates a employee called John Smith with an hourly rate of $15
		Employee emp1 = new Employee("John", "Smith", 15);

		/*
		 * Prompts the user for the first and last name of Employee 2 along with their
		 * pay rate
		 */
		System.out.println("Enter last name of Employee 2: ");
		String lname = sc.next();
		System.out.println("Enter the first name of Employee 2: ");
		String fname = sc.next();
		System.out.println("Enter the pay rate of Employee 2");
		double rate = sc.nextDouble();

		// Creates a second employee class and stores the user's submitted information
		Employee emp2 = new Employee(lname, fname, rate);

		// Prints the employee's information with a line between each
		emp1.print();
		System.out.println("");
		emp2.print();
		System.out.println("");

		/*
		 * Calculates the pay of John Smith using the .calculatePay method, taking into
		 * account his hourly rate and hours worked. Then prints it with the correct
		 * formating.
		 */
		double pay1 = emp1.calculatePay(42);
		System.out.println("John Smith recieved: " + fmt.format(pay1) + "\n");

		/*
		 * Calculates the pay of Employee 2 using the .calculatePay method, taking into
		 * account the hours worked and the pay rate the user submitted. Then prints
		 * that information with the correct formating.
		 */
		double pay2 = emp2.calculatePay(40);
		System.out.println(emp2.getName() + " received: " + fmt.format(pay2) + "\n");

		/*
		 * Prompts the user to give employee 1 a pay raise and then passes that
		 * information through the class emp1, updating the YTD pay and the hourly rate.
		 */
		System.out.println("Enter raise percentage for Employee 1: ");
		double userRaise1 = sc.nextDouble();
		emp1.giveRaise(userRaise1);

		/*
		 * Prompts the user to give employee 2 a pay raise and then passes that
		 * information through the class emp2, updating the YTD pay and the hourly rate.
		 */
		System.out.println("Enter raise percentage for Employee 2: ");
		double userRaise2 = sc.nextDouble();
		emp2.giveRaise(userRaise2);

		// Prints the updated payroll for both employees and makes a new line
		System.out.println("Displaying Employee Payroll: ");
		emp1.printPayrollLine(42);
		emp2.printPayrollLine(40);
		System.out.println("");

		/*
		 * Re-prints both employees information with the updated hourly rate and their
		 * respective YTD gross pay.
		 */
		System.out.println("Employee 1 Information: ");
		emp1.print();
		System.out.println("");
		System.out.println("Employee 2 Information: ");
		emp2.print();

		// Closes the scanner
		sc.close();
	}

}
