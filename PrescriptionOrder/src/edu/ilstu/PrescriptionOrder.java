/*
 * Created on: Oct 28, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * A class that sets up a users prescriptions and can transfer them, refill
 * them, and list them
 *
 * @author Michael Carlson
 *
 */
public class PrescriptionOrder
{
	public static int totalPrescriptions = 0;
	private String prescriptionRX;
	private String branch;
	private String drugName;
	private String drugType;
	private int refills;
	private int refillsRequested;

	/**
	 * Constructor
	 * 
	 * @param prescriptionRX Drug number
	 * @param drugName       Name of the drug
	 * @param branch         CVS branch
	 * @param drugType       Type of drug
	 */
	public PrescriptionOrder(String prescriptionRX, String drugName, String branch, String drugType)
	{
		totalPrescriptions += 1;
		this.prescriptionRX = prescriptionRX;
		this.branch = branch;
		this.drugName = drugName;
		this.drugType = drugType;
		this.refillsRequested = 0;
		this.refills = calcMaxRefills();

	}

	/**
	 * Calculates the refills
	 * 
	 * @return calcMaxRefills calculates how many refills based on drug type
	 */
	public int calcMaxRefills()
	{
		if (this.drugType.equals("Vaccine"))
		{
			return 0;
		} else if (this.drugType.equals("Antibiotic"))
		{
			return 1;
		} else if (this.drugType.equals("Vitamin supplement"))
		{
			return 5;
		} else
		{
			return 0;
		}

	}

	/**
	 * @return toString returns the formated class
	 */
	public String toString()
	{
		return (this.prescriptionRX + "\t" + this.drugName + "\t" + this.branch + " " + this.refills
				+ " remaining refills");
	}

	/**
	 * Returns the refills
	 * 
	 * @return getRefillsAvailable returns the available refills
	 */
	public int getRefillsAvailable()
	{
		return (this.refills - this.refillsRequested);
	}

	/**
	 * Calculates the refills available
	 * 
	 * @return refill returns if the refill was successful or not
	 */
	public boolean refill()
	{
		if (this.getRefillsAvailable() > 0)
		{
			this.refillsRequested += 1;
			this.refills = this.getRefillsAvailable();
			return true;
		} else
		{
			return false;
		}
	}

	/**
	 * Transfer the branch for a prescription
	 * 
	 * @param newBranch Stores the inputed branch
	 */
	public void transfer(String newBranch)
	{
		this.branch = newBranch;
	}

	/**
	 * Prints the menu
	 */
	public static void displayMenu()
	{
		System.out.println("\nPlease choose one of the following: \n");
		System.out.println("L - List all available prescription orders");
		System.out.println("R - Refill a prescription");
		System.out.println("T - Transfer a prescription");
		System.out.println("Q - Quit");
	}
}
