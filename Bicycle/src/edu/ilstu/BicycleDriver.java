/*
 * Created on: Nov 17, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * A program that lets the user search through an inventory of bikes based on
 * characteristics they choose
 *
 * @author Michael Carlson
 *
 */
public class BicycleDriver
{

	/**
	 * @param args
	 */
	// Makes a scanner for the whole class
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		// Creates a BicycleInventory object and stores it in 'inventory'
		BicycleInventory inventory = new BicycleInventory();
		// Puts the data in the text file into the inventory object
		inventory.readInventory();
		// Prints program creator
		System.out.println("Program by Michael Carlson\n");
		// Prompts the user for their name
		System.out.print("Please enter your name: ");
		String name = input.next();
		System.out.println("Welcome " + name + " to Wheels and Gears!");

		// Prints the menu
		menuOptions();

		// Prompts the user which option they would like to pick, giving an error if the
		// number is out of range
		int menuNumber = input.nextInt();
		while (((menuNumber < 1) || (menuNumber > 7)))
		{
			System.out.println("Invalid entry, try again.");
			menuOptions();
			menuNumber = input.nextInt();
		}

		// Gets the method that chooses options
		getChoice(menuNumber, inventory);

	}

	/**
	 * Prints the menu and its options
	 */
	public static void menuOptions()
	{
		System.out.println();
		System.out.println("1 - List inventory by wheel size");
		System.out.println("2 - List inventory by type");
		System.out.println("3 - List inventory by gender");
		System.out.println("4 - List inventory by assembled");
		System.out.println("5 - List inventory by all criteria");
		System.out.println("6 - List entire inventory");
		System.out.println("7 - Quit");
	}

	/**
	 * Takes an array of Bicycles and prints the non null values
	 * 
	 * @param bike The array of bikes to be printed
	 */
	public static void outputList(Bicycle[] bike)
	{
		// A counter to track if any bikes are outputed
		int counter = 0;
		// Loops through the given array, displaying non null values
		for (int i = 0; i < bike.length; i++)
		{
			if (bike[i] != null)
			{
				System.out.println(bike[i].toString());
				counter++;
			}
		}
		// If no bikes are outputed, display a sorry message
		if (counter == 0)
		{
			System.out.println("Sorry! We have no bikes like this!");
		}
	}

	/**
	 * Takes the users input and starts the correct method to output the preferred
	 * bikes
	 * 
	 * @param number      A value to check what option the user picked
	 * @param myInventory The object to preform all the searching on
	 * @return Returns a string of bicycles that are printed
	 */
	public static BicycleInventory getChoice(int number, BicycleInventory myInventory)
	{
		if (number == 1)
		{
			outputList(processByWheelSize(myInventory));

			// Prints the menu
			menuOptions();

			// Prompts the user which option they would like to pick, giving an error if the
			// number is out of range
			int menuNumber = input.nextInt();
			while (((menuNumber < 1) || (menuNumber > 7)))
			{
				System.out.println("Invalid entry, try again.");
				menuOptions();
				menuNumber = input.nextInt();
			}

			// Gets the number of bikes of given inventory
			getChoice(menuNumber, myInventory);
		}
		if (number == 2)
		{
			outputList(processType(myInventory));

			// Prints the menu
			menuOptions();

			// Prompts the user which option they would like to pick, giving an error if the
			// number is out of range
			int menuNumber = input.nextInt();
			while (((menuNumber < 1) || (menuNumber > 7)))
			{
				System.out.println("Invalid entry, try again.");
				menuOptions();
				menuNumber = input.nextInt();
			}

			// Gets the number of bikes of given inventory
			getChoice(menuNumber, myInventory);
		}
		if (number == 3)
		{
			outputList(processByGender(myInventory));

			// Prints the menu
			menuOptions();

			// Prompts the user which option they would like to pick, giving an error if the
			// number is out of range
			int menuNumber = input.nextInt();
			while (((menuNumber < 1) || (menuNumber > 7)))
			{
				System.out.println("Invalid entry, try again.");
				menuOptions();
				menuNumber = input.nextInt();
			}

			// Gets the number of bikes of given inventory
			getChoice(menuNumber, myInventory);
		}
		if (number == 4)
		{
			outputList(processByAssemble(myInventory));

			// Prints the menu
			menuOptions();

			// Prompts the user which option they would like to pick, giving an error if the
			// number is out of range
			int menuNumber = input.nextInt();
			while (((menuNumber < 1) || (menuNumber > 7)))
			{
				System.out.println("Invalid entry, try again.");
				menuOptions();
				menuNumber = input.nextInt();
			}

			// Gets the number of bikes of given inventory
			getChoice(menuNumber, myInventory);
		}
		if (number == 5)
		{
			outputList(processByAllCriteria(myInventory));

			// Prints the menu
			menuOptions();

			// Prompts the user which option they would like to pick, giving an error if the
			// number is out of range
			int menuNumber = input.nextInt();
			while (((menuNumber < 1) || (menuNumber > 7)))
			{
				System.out.println("Invalid entry, try again.");
				menuOptions();
				menuNumber = input.nextInt();
			}

			// Gets the number of bikes of given inventory
			getChoice(menuNumber, myInventory);
		}
		if (number == 6)
		{
			// Loops through the myInventory array, printing all values
			for (int i = 0; i < myInventory.bikeArray.length; i++)
			{
				System.out.println(myInventory.bikeArray[i].toString());
			}

			// Prints the menu
			menuOptions();

			// Prompts the user which option they would like to pick, giving an error if the
			// number is out of range
			int menuNumber = input.nextInt();
			while (((menuNumber < 1) || (menuNumber > 7)))
			{
				System.out.println("Invalid entry, try again.");
				menuOptions();
				menuNumber = input.nextInt();
			}

			// Gets the number of bikes of given inventory
			getChoice(menuNumber, myInventory);
		}
		if (number == 7)
		{
			System.out.println("Goodbye!");
			input.close();

		}
		return null;
	}

	/**
	 * Prompts the user for the size of the bike tire as well as how many bikes to
	 * be collected
	 * 
	 * @param myBike Takes an object of type BicycleInventory
	 * @return returns an array of valid bicycles
	 */
	public static Bicycle[] processByWheelSize(BicycleInventory myBike)
	{
		// Variable for the size of the wheel
		int wheelSize;

		// Prompts the user for the size of the wheel and only continues if 14 or 16
		System.out.println("What wheel size do you want, 14 or 16:");
		wheelSize = input.nextInt();
		while (!(wheelSize == 14 || wheelSize == 16))
		{
			System.out.println("What wheel size do you want, 14 or 16:");
			wheelSize = input.nextInt();
		}
		// Prompts for how many bikes to find
		System.out.println("How many do you want to find: ");
		int numOfBikes = input.nextInt();

		// Returns the array getChoices finds with said parameters
		return myBike.getChoices(numOfBikes, wheelSize);
	}

	/**
	 * Prompts the user for what type of bike they want
	 * 
	 * @return Returns a string determining what type of bike the user wants
	 */
	public static String determineType()
	{
		// Int for the type of bike the user requests
		int requestedType;

		// Menu for the user to select from
		System.out.println("1 - Mountain");
		System.out.println("2 - Speed");
		System.out.println("3 - Hybrid");
		System.out.println("4 - Road");
		System.out.println("5 - Dirt");

		// Gets the type the user wants with an integer and makes sure it is within
		// range
		requestedType = input.nextInt();
		while (requestedType < 1 || requestedType > 5)
		{
			// If not within range, print the menu again and re-prompt
			System.out.println("Invalid");
			System.out.println("1 - Mountain");
			System.out.println("2 - Speed");
			System.out.println("3 - Hybrid");
			System.out.println("4 - Road");
			System.out.println("5 - Dirt");
			requestedType = input.nextInt();
		}

		// Based on the number given a string is returned
		if (requestedType == 1)
		{
			return "Mountain";
		}
		if (requestedType == 2)
		{
			return "Speed";
		}
		if (requestedType == 3)
		{
			return "Hybrid";
		}
		if (requestedType == 4)
		{
			return "Road";
		}
		if (requestedType == 5)
		{
			return "Dirt";
		}
		return null;
	}

	/**
	 * Returns a string of bicycles based on the users preferred type
	 * 
	 * @param myBike Takes an object of type BicycleInventory
	 * @return Returns an array of valid bicycles
	 */
	public static Bicycle[] processType(BicycleInventory myBike)
	{
		// A string that stores the type received in determineType
		String submittedString = determineType();
		// Prompts for how many bikes to find
		System.out.println("How many do you want to find: ");
		int numOfBikes = input.nextInt();

		// Returns an array of valid bicycles
		return myBike.getChoices(numOfBikes, submittedString);
	}

	/**
	 * Returns a string of bicycles based on the preferred gender
	 * 
	 * @param myBike Takes an object of type BicycleInventory
	 * @return Returns an array of valid bicycles
	 */
	public static Bicycle[] processByGender(BicycleInventory myBike)
	{
		// genderQuestion stores an integer that corresponds to a gender
		int genderQuestion;
		// gender stores the char of a gender
		char gender;
		// A do while loop that prompts the user for their requested gender
		do
		{
			System.out.println("What gender bike do you want? '1' for female and '2' for male: ");
			genderQuestion = input.nextInt();
		} while ((genderQuestion != 1 && genderQuestion != 2));

		/*
		 * Since the previous loop made sure the gender was only one of two options,
		 * gender is now set to its character if the inputed value was one, else it must
		 * be two
		 */
		if (genderQuestion == 1)
		{
			gender = 'f';
		} else
		{
			gender = 'm';
		}
		// Prompts for how many bikes to find
		System.out.println("How many do you want to find: ");
		int numOfBikes = input.nextInt();

		// Returns an array of bicycles
		return myBike.getChoices(numOfBikes, gender);
	}

	/**
	 * Returns a string of valid bicycles based on assembly
	 * 
	 * @param myBike Takes an object of type BicycleInventory
	 * @return Returns an array of valid bicycles
	 */
	public static Bicycle[] processByAssemble(BicycleInventory myBike)
	{
		// A bool to store the assembly status and a string to store the users answer
		Boolean isAssembled;
		String answer;
		// Makes sure the answer is either yes or no
		do
		{
			System.out.println("Do you want this Assembled? (Answer yes or no): ");
			answer = input.next();
		} while (!(answer.equals("yes") || answer.equals("no")));

		// If the answer is yes, set the assebmly to true, else set it to false
		if (answer.equals("yes"))
		{
			isAssembled = true;
		} else
		{
			isAssembled = false;
		}

		// Prompts for how many bikes to find
		System.out.println("How many do you want to find: ");
		int numOfBikes = input.nextInt();

		return myBike.getChoices(numOfBikes, isAssembled);
	}

	/**
	 * Takes in all values and finds a bike that fits all attributes
	 * 
	 * @param myBike Takes an object of type BicycleInventory
	 * @return Returns an array of valid bicycles
	 */
	public static Bicycle[] processByAllCriteria(BicycleInventory myBike)
	{
		// Variable to track wheel size
		int wheelSize;

		// Prompts the user for the size of the wheel and only continues if 14 or 16
		System.out.println("What wheel size do you want, 14 or 16:");
		wheelSize = input.nextInt();
		while (!(wheelSize == 14 || wheelSize == 16))
		{
			System.out.println("What wheel size do you want, 14 or 16:");
			wheelSize = input.nextInt();
		}

		// A string that stores the type received in determineType
		String submittedString = determineType();
		// Prompts for how many bikes to find

		// genderQuestion stores an integer that corresponds to a gender
		int genderQuestion;
		// gender stores the char of a gender
		char gender;
		// A do while loop that prompts the user for their requested gender
		do
		{
			System.out.println("What gender bike do you want? '1' for female and '2' for male: ");
			genderQuestion = input.nextInt();
		} while ((genderQuestion != 1 && genderQuestion != 2));

		/*
		 * Since the previous loop made sure the gender was only one of two options,
		 * gender is now set to its character if the inputed value was one, else it must
		 * be two
		 */
		if (genderQuestion == 1)
		{
			gender = 'f';
		} else
		{
			gender = 'm';
		}

		// A bool to store the assembly status and a string to store the users input
		Boolean isAssembled;
		String answer;

		// Checks if the users input is yes or no
		do
		{
			System.out.println("Do you want this Assembled? (Answer yes or no): ");
			answer = input.next();
		} while (!(answer.equals("yes") || answer.equals("no")));

		// If the answer is yes, set the assebmly to true, else set it to false
		if (answer.equals("yes"))
		{
			isAssembled = true;
		} else
		{
			isAssembled = false;
		}

		// Prompts for how many bikes to find
		System.out.println("How many do you want to find: ");
		int numOfBikes = input.nextInt();

		// returns an array of bikes that matches said criteria
		return myBike.getChoices(numOfBikes, submittedString, wheelSize, isAssembled, gender);

	}
}
