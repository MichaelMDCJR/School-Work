package edu.ilstu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Tester for toString, read, and write methods of BankAccount
 * 
 * @author Mary Elaine Califf and Michael Carlson
 * 
 *         ULID: mdcarl2
 *
 */
public class AccountFileTester
{

	public static void main(String[] args)
	{
		// simple toString test
		System.out.println("Testing toString");
		System.out.println("Creating BankAccount with name Meg Booth, acct number 11111111, balance 500.00");
		BankAccount testAcct = new BankAccount(500, "Meg Booth", "11111111");
		System.out.println(testAcct);
		System.out.println();

		try
		{
			// open the input and output files
			Scanner infile = new Scanner(new File("accounts.txt"));
			PrintWriter outfile = new PrintWriter(new FileWriter("accounts2.txt", false));

			// first read one and print the toString
			System.out.println("The first record from the file accounts.txt");
			BankAccount tempAcct = new BankAccount();
			tempAcct.read(infile);
			System.out.println(tempAcct);
			System.out.println();

			// print first to the file
			tempAcct.write(outfile);

			// print testAcct to the file
			testAcct.write(outfile);

			// read the rest of the accounts -- adding 100 to each balance before writing to
			// the accounts2.txt file
			while (infile.hasNext())
			{
				tempAcct.read(infile);
				tempAcct.deposit(100);
				tempAcct.write(outfile);
			}

			// print the last account read to the screen
			System.out.println("Last account read (with additional $100): ");
			System.out.println(tempAcct);

			// never forget to close your files
			infile.close();
			outfile.close();

			// Now make sure that the file we wrote can be read correctly
			System.out.println("The contents of the accounts2.txt file");
			infile = new Scanner(new File("accounts2.txt"));
			while (infile.hasNext())
			{
				tempAcct.read(infile);
				System.out.println(tempAcct);
			}
			infile.close();
		} catch (IOException e)
		{
			System.err.println("Exception caught: " + e.getMessage());
		}

	}

}
