/*
 * Filename: TestBankAccount.java 
 * Last modified on March 7, 2006 
 * 
 * Course: ITK 168
 * Semester: Spring 06
 */
package edu.ilstu;

/**
 * This is a short program to test deposits and withdrawals in BankAccount
 * 
 * @author Lewis and Loftus - modified by Shirley White and Mary Elaine Califf
 */
public class TestBankAccount
{

	public static void main(String[] args)
	{
		BankAccount acct;

		// create account with $1000
		acct = new BankAccount(1000, "Smith", "1111");

		// deposit $50 to account
		acct.deposit(50);

		// withdraw $500 from account
		acct.withdraw(500);

		// charge fee
		acct.chargeFee();

		// print account information
		System.out.println(acct.toString());

	}
}