package edu.ilstu;

import java.text.NumberFormat;

/*
 * Employee.java
 * Created on Oct 4, 2004
 * By Mary Elaine Califf
 *
 */

/**
 * Employee class stores information about an hourly employee
 * 
 * @author Mary Elaine Califf
 */
public class Employee {
	private String lastName;
	private String firstName;
	private double payRate;
	private double grossPayYTD;

	/**
	 * Constructor
	 * 
	 * @param lName The employee's last name
	 * @param fName The employee's first name
	 * @param rate  The hourly pay rate of the employee
	 */
	public Employee(String lName, String fName, double rate) {
		lastName = lName;
		firstName = fName;
		payRate = rate;
		grossPayYTD = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param lName    The employee's last name
	 * @param fName    The employee's first name
	 * @param rate     The hourly pay rate of the employee
	 * @param ytdGross The gross pay year to date for the employee
	 */
	public Employee(String lName, String fName, double rate, double ytdGross) {
		lastName = lName;
		firstName = fName;
		payRate = rate;
		grossPayYTD = ytdGross;
	}

	/**
	 * @return The employee's first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName The first name to set.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return The employee's last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName The last name to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return The employee's gross pay year to date.
	 */
	public double getGrossPayYTD() {
		return grossPayYTD;
	}

	/**
	 * @return The employee's hourly pay rate.
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @return The employee's name in first last format
	 */
	public String getName() {
		return firstName + " " + lastName;
	}

	/**
	 * @return The employee's name in last, first format
	 */
	public String getLFName() {
		return lastName + ", " + firstName;
	}

	/**
	 * Gives the employee a raise
	 * 
	 * @param percentRaise The percentage by which the hourly rate is to increase: 5
	 *                     is 5%
	 */
	public void giveRaise(double percentRaise) {
		this.payRate += this.payRate * percentRaise / 100.0;
	}

	/**
	 * Calculates the employee's weekly pay, updates the grossPayYTD, and returns
	 * the pay for the week. Pay does take overtime into account.
	 * 
	 * @param hoursWorked Number of hours worked that week
	 * @return The pay for the week
	 */
	public double calculatePay(int hoursWorked) {
		double pay;
		if (hoursWorked > 40) {
			pay = payRate * 40 + (1.5 * payRate * (hoursWorked - 40));
		} else {
			pay = payRate * hoursWorked;
		}
		grossPayYTD += pay;
		return pay;
	}

	/**
	 * Calculates and prints payroll information. Object data is updated.
	 * 
	 * @param hoursWorked Number of hours worked that week
	 */
	public void printPayrollLine(int hoursWorked) {
		double pay = this.calculatePay(hoursWorked);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.print(this.lastName + ", " + this.firstName + "\t");
		System.out.println(fmt.format(pay));
	}

	/**
	 * Prints all information about the employee to the screen with appropriate
	 * labels and good formatting.
	 */
	public void print() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Hourly pay rate: " + fmt.format(payRate));
		System.out.println("Gross pay year to date: " + fmt.format(grossPayYTD));
	}
}
