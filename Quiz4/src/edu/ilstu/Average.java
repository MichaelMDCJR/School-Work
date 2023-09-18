/*
 * Created on: Nov 15, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Asks the user for an amount of classes, the number of students in each class,
 * and finds the average number of students
 *
 * @author Michael Carlson
 *
 */
public class Average
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int classes;
		int average = 0;

		System.out.print("Please enter the number of classes: ");
		classes = input.nextInt();
		int[] classArray = new int[classes];

		for (int i = 0; i < classArray.length; i++)
		{
			System.out.print("Enter the size of class " + (i + 1) + ":");
			classArray[i] = input.nextInt();
			average += classArray[i];
		}

		average = average / classes;
		System.out.println("\nThe average class size is " + average + "\n");
		System.out.println("Class\t\tNumber of Students");
		for (int i = 0; i < classArray.length; i++)
		{
			System.out.println((i + 1) + "\t\t" + classArray[i]);
		}

		input.close();
	}

}
