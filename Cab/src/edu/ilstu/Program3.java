/*
 * Created on: Oct 12, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Random;
import java.util.Scanner;

/**
 * Simulates the drunken walk of an alcoholic as they stumble through the
 * streets of Normal, looking for their apartment. Does so by choosing a random
 * number and moving the person in a direction on a coordinate plane, as long as
 * the number will not be negative. Prints a success statement if the person
 * makes it home, and a failure statement after 100 movements.
 *
 * @author Michael Carlson
 *
 */
public class Program3
{

	public static void main(String[] args)
	{
		// Creates a scanner and a random number generator
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		/*
		 * Creates variables for the persons location, apartment location, direction
		 * they move, and a counter
		 */
		int aptX;
		int aptY;
		int randMove;
		int counter = 1;
		int personX = 3;
		int personY = 5;

		// Prompts the user for the apartment location and stores the X and Y variables
		System.out.println("What is the x location of the appartment: ");
		aptX = input.nextInt();
		System.out.println("What is the y location of the appartment: ");
		aptY = input.nextInt();

		// A while loop that shuts off after 100 iterations
		while (counter <= 100)
		{
			// Creates a random number between 1 and 4 to decide what direction to move
			randMove = (rand.nextInt(4)) + 1;

			// If the random number is 1, the person moves North
			if (randMove == 1)
			{
				personY++;
			}

			/*
			 * If the random number is 2, the person moves South, as long as they are not
			 * already on 0, which would make them go negative
			 */
			if (randMove == 2 && (personY != 0))
			{
				personY--;
			}

			// If the random number is 3, the person moves East
			if (randMove == 3)
			{
				personX++;
			}
			/*
			 * If the random number is 4, the person moves West, as long as they are not
			 * already on 0, which would make them go negative
			 */
			if (randMove == 4 && (personX != 0))
			{
				personX--;
			}

			// Prints the person's coordinates after every block
			System.out.println(randMove + "(" + personX + "," + personY + ")");

			/*
			 * If the person's location is the same as their apartment, set the counter to
			 * 101 to shut off the loop and print "Welcome Home"
			 */
			if (personX == aptX && personY == aptY)
			{
				counter = 101;
				System.out.println("Welcome Home!");
			}

			// Adds one to the counter every loop
			counter++;
		}

		/*
		 * If the counter gets to 100 and hasn't found the apartment, the lost message
		 * is printed
		 */
		if (counter == 101)
		{
			System.out.println("Call me a cab, I'm lost!");
		}

		// Close the scanner
		input.close();
	}

}
