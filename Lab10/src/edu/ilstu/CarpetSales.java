/*
 * Created on: Oct 25, 2022
 *
 * ULID: mdcarl2
 * ULID: lrbenn1
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Class testing the RoomCarpet Class and the RoomDimensions Class
 *
 * @author Michael Carlson and Logan Bennett
 *
 */
public class CarpetSales
{

	public static void main(String[] args)
	{

		// Creates a scanner and decimal format
		Scanner s = new Scanner(System.in);
		DecimalFormat carpetSales = new DecimalFormat("$#, ##0.00");

		// Asks user to enter length and width, stores it in the RoomDimensions class
		// with the object named room
		System.out.print("Please enter the length, hit enter and then enter the width.");
		RoomDimensions room = new RoomDimensions(s.nextDouble(), s.nextDouble());

		// Asks user to enter cost of carpet, stores it in the RoomCarpet class with the
		// object named carpet
		System.out.println("Please enter the cost per square foot of carpet: ");
		RoomCarpet carpet = new RoomCarpet(room, s.nextDouble());

		// Prints out the total cost of the object carpet (using both classes to do so)
		System.out.println(carpetSales.format(carpet.totalCost(room)));

		// Closes the scanner
		s.close();
	}

}
