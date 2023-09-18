/*
 * Created on: Sep 6, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * Prints my names, my name with my middle name shortened, prints my name with
 * upper and lower case, the length of my name, the middle letter of my last
 * name, and the last letter of my first name
 *
 * @author Michael Carlson
 *
 */
public class StringExperiment
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Initializes 3 strings with my first, middle, and last name
		String firstName = "Michael";
		String middleName = "David";
		String lastName = "Carlson";

		// Prints my full name with a space between each word by adding a space using
		// quotes
		System.out.println(firstName + " " + middleName + " " + lastName);

		// Prints my full name but prints the first letter of my middle name with a
		// period using charAt
		System.out.println(firstName + " " + middleName.charAt(0) + ". " + lastName);

		// Prints my first name in all caps using toUpperCase and my last name in all
		// lower case with toLowerCase
		System.out.println(firstName.toUpperCase() + " " + lastName.toLowerCase());

		// Prints the length of my last name with a label using the .length method
		System.out.println("Length of last name: " + lastName.length());

		// Gets the length of the name and divides it by two, then passes that value to
		// charAt to print the letter at the middle of my last name
		System.out.println("The middle letter of my last name is : " + lastName.charAt(lastName.length() / 2));

		// Takes the length of my first name, subtracts 1 because strings start at 0,
		// and passes that value to charAt to print the last letter of my first name
		System.out.println("The last letter of my first name is: " + firstName.charAt(firstName.length() - 1));

	}

}
