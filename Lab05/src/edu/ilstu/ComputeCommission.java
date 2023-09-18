/*
 * Created on: Sep 5, 2020
 */
package edu.ilstu;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Program to calculate the commission on a sale
 * 
 * @author Mary Elaine Califf and Michael Carlson
 *
 */
public class ComputeCommission
{

	public static void main(String[] args)
	{
		// constants
		final double LOW_COMMISSION_RATE = 0.05;
		final double HIGH_COMMISSION_RATE = 0.075;
		final int BONUS_AMOUNT = 500;

		// variables
		int numItemsSold;
		int totalSaleAmount;
		double commissionAmount = 0;
		double saleAfterCommission;
		boolean bonusReceived = false;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.println("Welcome to the Normal Commission Calculator!");

		// collect inputs
		System.out.print("Please enter the number of items sold: ");
		numItemsSold = keyboard.nextInt();

		System.out.print("Please enter the total sale amount: ");
		totalSaleAmount = keyboard.nextInt();

		// determine base commission
		if (totalSaleAmount < 5000)
		{
			commissionAmount = totalSaleAmount * LOW_COMMISSION_RATE;
		} else
		{
			commissionAmount = totalSaleAmount * HIGH_COMMISSION_RATE;
		}

		saleAfterCommission = totalSaleAmount - commissionAmount;

		// add bonus if any
		if (numItemsSold > 5 && saleAfterCommission >= 20000)
		{
			bonusReceived = true;
			commissionAmount = commissionAmount + 500;
		}

		System.out.print("The total commission earned is ");
		System.out.println(formatter.format(commissionAmount));
		if (bonusReceived)
		{
			System.out.print("This includes a bonus of ");
			System.out.println(formatter.format(BONUS_AMOUNT));
		}
	}

}