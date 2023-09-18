/*
 * Filename: BankAccount.java 
 * Last modified on November 15, 2020 
 * 
 * Course: IT 168
 */
package edu.ilstu;

import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * This is a simple bank account class.
 * 
 * @author Lewis and Loftus, Shirley White, Mary Elaine Califf and Michael
 *         Carlson
 * 
 */
public class BankAccount
{
	private double balance;
	private String name;
	private String acctNum;
	// Creates a number format to format the account balance
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	/**
	 * Default constructor
	 */
	public BankAccount()
	{
		this(0, "", "");
	}

	/**
	 * @param initBal The initial balance of the account
	 * @param owner   The name on the account
	 * @param number  The account number
	 */
	public BankAccount(double initBal, String owner, String number)
	{
		this.balance = initBal;
		this.name = owner;
		this.acctNum = number;
	}

	/**
	 * Checks to see if balance is sufficient for withdrawal. If so, decrements
	 * balance by amount; if not, prints error message.
	 * 
	 * @param amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if (this.balance <= amount)
			this.balance = this.balance - amount;
		else
			System.out.println("Insufficient funds");
	}

	/**
	 * Adds deposit amount to balance.
	 * 
	 * @param amount to be deposited
	 */
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}

	/**
	 * Getter for the balance
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}

	/**
	 * Deducts a $10 fee
	 */
	public void chargeFee()
	{
		this.balance = this.balance - 10;
	}

	/**
	 * Setter for the name
	 * 
	 * @param newName The new name on the account
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}

	/**
	 * Formats the Account info and returns it
	 * 
	 * @return The formated account information
	 */
	public String toString()
	{
		return "Account Holder: " + this.name + "\nAccount Number: " + this.acctNum + "\nBalance: "
				+ fmt.format(this.balance);
	}

	/**
	 * Reads from a file
	 * 
	 * @param input A scanner to read from a file
	 */
	public void read(Scanner input)
	{
		// Reads the name from the file and moves the scanner to the next line
		this.name = input.nextLine();
		// Reads the account number from the file
		this.acctNum = input.next();
		// Reads the balance from the file and moves the scanner to the next line
		this.balance = input.nextDouble();
		input.nextLine();
	}

	/**
	 * Writes to a file
	 * 
	 * @param output A PrintWriter to write to a file
	 */
	public void write(PrintWriter output)
	{
		// Prints the name to the file and moves the printer to the next line
		output.println(name);
		// Prints the account number to the file, a space, and then the balance before
		// moving to the next line
		output.print(acctNum + " ");
		output.println(balance);
	}
}
