/*
 * Created on 
 * 
 * ULID: mdcarl2
 * ULID: lrbenn1 
 * Class: IT 168
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Takes a number inputed by the user and responds with the coresponding color
 *
 * @author Michael Carlson & Logan Bennett
 *
 *
 */
public class SwitchErrors
{

	public static void main(String[] args)
	{
		// Creates a scanner to read the users number
		Scanner keyboard = new Scanner(System.in);

		// Provides the key and the prompt
		System.out.println("Key:  1 = blue, 2 = red, 3 = green");
		System.out.print("Enter a number and I'll return ");
		System.out.print("the corresponding color.  ");

		// Gets the number from the user
		int number = keyboard.nextInt();

		// Makes a switch statement that outputs a color depending on the number
		switch (number)
		{
		case 1:
			System.out.println("You chose blue!");
			break;
		case 2:
			System.out.println("You chose red!");
			break;
		case 3:
			System.out.println("You chose green!");
			break;
		default:
			System.out.println("Color not available!");
			break;
		}

		// Closes the keyboard
		keyboard.close();
	}

}
