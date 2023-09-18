/*
 * Filename: BankAccount.java 
 * Last modified on September 23, 2020 
 * 
 * Course: ITK 168
 * 
 * ULID:mdcarl2
 * ULID:lrbenn1
 * ULID:smventr
 */
package edu.ilstu;

import java.text.NumberFormat;

/**
 * This is a simple bank account class with methods to deposit to, withdraw
 * from, change the name on, charge a fee to, and print a summary of the
 * account.
 * 
 * @author Lewis and Loftus - modified by Shirley White and Mary Elaine Califf
 *         and Michael Carlson and Logan Bennett and Salvatore Ventrone
 * 
 */
public class BankAccount
{
	private double balance;
	private String name;
	private String acctNum;

	/**
	 * Constructor
	 * 
	 * @param initBal - the initial balance of the account
	 * @param owner   - the name on the account
	 * @param number  - the account number
	 */
	public BankAccount(double initBal, String owner, String number)
	{
		this.balance = initBal;
		this.name = owner;
		this.acctNum = number;
	}

	/**
	 * Checks to see if balance is sufficient for withdrawal. If so, decrements
	 * balance by amount; if not, prints message.
	 * 
	 * @param amount The amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if (this.balance >= amount)
			this.balance = this.balance - amount;
		else
			System.out.println("Insufficient funds");
	}

	/**
	 * Adds deposit amount to balance.
	 * 
	 * @param amount The amount to be deposited
	 */
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}

	/**
	 * Getter for balance
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}

	/**
	 * Overridden toString method
	 * 
	 * @return a string containing the name, account number, and balance with the
	 *         balance written in currency format
	 */
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return this.name + " " + this.acctNum + " " + fmt.format(this.balance);
	}

	/**
	 * Deducts a $10 fee
	 */
	public void chargeFee()
	{
		this.balance = this.balance - 10;
	}

	/**
	 * Setter for the name on the account
	 * 
	 * @param newName The new name for the account owner
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}

}
