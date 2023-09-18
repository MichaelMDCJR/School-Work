/*
 * Created on: Oct 4, 2022
 *
 * ULID: mdcarl2
 * ULID: Ktbark1
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Takes exam scores and calculates the number of students, minimum score,
 * maximum score, the number of A's, and the average score
 *
 * @author Michael Carlson and Keeton Barker
 *
 */
public class ExamCalculations
{

	public static void main(String[] args)
	{
		// Makes variables for all fo the data that will be stored
		int examScore;
		int numStudents = 0;
		int minScore = 100;
		int maxScore = 0;
		double averageScore = 0;
		int numA = 0;

		// Makes a scanner to read from the keyboard
		Scanner input = new Scanner(System.in);

		// Makes a decimal format so the average will always be to the tenth
		DecimalFormat format = new DecimalFormat("0.#");

		// Prompt the user and read the first exam score
		System.out.print("Please enter exam score (-1 to exit): ");
		examScore = input.nextInt();

		// Makes a while loop that will stop when the sentinal value -1 is entered
		while (examScore != -1)
		{
			// Adds one to the number of students
			numStudents++;

			// If the current score is bigger than the max, set it as the new max
			if (examScore >= maxScore)
			{
				maxScore = examScore;
			}
			// If the current score is smaller than the min, set it as the new low
			if (examScore <= minScore)
			{
				minScore = examScore;
			}

			// Set the average score to itself plus the current exam score with the average
			// to be calculated later
			averageScore = averageScore + examScore;

			// If a score is an A, add one to the A counter
			if (examScore >= 90)
			{
				numA++;
			}

			// Re-prompt the user and take an input from the keyboard
			System.out.print("Please enter exam score (-1 to exit): ");
			examScore = input.nextInt();
		}

		// Calculates the average score by diving the total scores by the number of
		// students
		averageScore = averageScore / numStudents;

		// Prints all the data with the correct formating on the average score
		System.out.println("The number of students is: " + numStudents);
		System.out.println("The minimum score is: " + minScore);
		System.out.println("The maximum score is: " + maxScore);
		System.out.println("The number of A's is: " + numA);
		System.out.println("The average score is: " + format.format(averageScore));

		// Closes the scanner
		input.close();
	}

}
