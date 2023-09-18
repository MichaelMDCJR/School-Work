/*
 * Created on: Oct 11, 2022
 *
 * ULID:mdcarl2
 * ULID:lrbenn1
 * ULID:smventr
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
/**
 * Test class for the Circle class
 *
 * @author Michael Carlso, Logan Bennett, Salvatore Ventrone
 *
 */
import java.util.Scanner;

public class CircleCheck
{

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{

		// Creates decimal format for the circle area,diameter, and circumference
		DecimalFormat myFormat = new DecimalFormat("#.#####");

		// Creates scanner for user input and prompts user to enter a radius, radius is
		// stored in the myCircle variable (from the circle class)
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the radius?");
		Circle myCircle = new Circle(userInput.nextDouble());

		// Prints myCircles area, diameter, and circumference
		System.out.println("Area: " + myFormat.format(myCircle.calculateArea()));
		System.out.println("Diameter: " + myFormat.format(myCircle.calculateDiameter()));
		System.out.println("Circumference: " + myFormat.format(myCircle.calculateCircumference()));

		// Closes scanner
		userInput.close();
	}

}
