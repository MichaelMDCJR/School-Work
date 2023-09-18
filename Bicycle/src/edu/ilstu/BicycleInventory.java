/*
 * Created on: Nov 17, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * A class that sets up the inventory and then searches through the inventory, finding matching bikes
 * 
 * @author Michael Carlson
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BicycleInventory
{
	public Bicycle[] bikeArray;

	/**
	 * Constructor
	 * 
	 * Makes a BicycleInventory with 25 Bicycle objects
	 */
	public BicycleInventory()
	{
		this.bikeArray = new Bicycle[25];
	}

	/**
	 * Finds bikes with the chosen type
	 * 
	 * @param number The number of bikes to search for
	 * @param type   The type of bike to search for
	 * @return Returns a string of matching bikes
	 */
	public Bicycle[] getChoices(int number, String type)
	{
		// A counter to track how many bikes are collected
		int counter = 0;
		// A new array to store collected bikes
		Bicycle[] selectedBikes = new Bicycle[25];

		// Loops through the array given to find bikes that fit said criteria
		for (int i = 0; i < selectedBikes.length; i++)
		{
			/*
			 * If the given type matches the requested type and the users bike quota has not
			 * been met, make a deep copy of the bike in the given array in the new array
			 */
			if (type.equals(this.bikeArray[i].type) && counter < number)
			{
				selectedBikes[i] = new Bicycle();
				String myType = this.bikeArray[i].getType();
				selectedBikes[i].setType(myType);
				int myWheelSize = this.bikeArray[i].getWheelSize();
				selectedBikes[i].setWheelSize(myWheelSize);
				boolean myAssembled = this.bikeArray[i].isAssembled();
				selectedBikes[i].setAssembled(myAssembled);
				char myGender = this.bikeArray[i].getGender();
				selectedBikes[i].setGender(myGender);
				counter++;
			}

		}
		// Return the new array
		return selectedBikes;
	}

	/**
	 * Gets a number of bikes given by the user that match the given wheel size and
	 * returns an array with those bikes
	 * 
	 * @param number    The number of bikes requested by the user
	 * @param wheelSize The wheel size requested by the user
	 * @return An array of correct bicycles
	 */
	public Bicycle[] getChoices(int number, int wheelSize)
	{
		// A counter to track how many bikes are collected
		int counter = 0;
		// A new array to store collected bikes
		Bicycle[] selectedBikes = new Bicycle[25];

		// Loops through the array given to find bikes that fit said criteria
		for (int i = 0; i < selectedBikes.length; i++)
		{
			/*
			 * If the given wheel size matches the requested wheel size and the users bike
			 * quota has not been met, make a deep copy of the bike in the given array in
			 * the new array
			 */
			if (wheelSize == this.bikeArray[i].wheelSize && counter < number)
			{
				selectedBikes[i] = new Bicycle();
				String myType = this.bikeArray[i].getType();
				selectedBikes[i].setType(myType);
				int myWheelSize = this.bikeArray[i].getWheelSize();
				selectedBikes[i].setWheelSize(myWheelSize);
				boolean myAssembled = this.bikeArray[i].isAssembled();
				selectedBikes[i].setAssembled(myAssembled);
				char myGender = this.bikeArray[i].getGender();
				selectedBikes[i].setGender(myGender);
				counter++;
			}

		}
		// Return the new array
		return selectedBikes;
	}

	/**
	 * Finds bikes with the desired assembly status
	 * 
	 * @param number    The number of bikes requested by the user
	 * @param assembled The assembly requested by the user
	 * @return An array of correct bicycles
	 */
	public Bicycle[] getChoices(int number, boolean assembled)
	{
		// A counter to track how many bikes are collected
		int counter = 0;
		// A new array to store collected bikes
		Bicycle[] selectedBikes = new Bicycle[25];

		// Loops through the array given to find bikes that fit said criteria
		for (int i = 0; i < selectedBikes.length; i++)
		{
			/*
			 * If the given assembly matches the requested assembly and the users bike quota
			 * has not been met, make a deep copy of the bike in the given array in the new
			 * array
			 */
			if (assembled == this.bikeArray[i].assembled && counter < number)
			{
				selectedBikes[i] = new Bicycle();
				String myType = this.bikeArray[i].getType();
				selectedBikes[i].setType(myType);
				int myWheelSize = this.bikeArray[i].getWheelSize();
				selectedBikes[i].setWheelSize(myWheelSize);
				boolean myAssembled = this.bikeArray[i].isAssembled();
				selectedBikes[i].setAssembled(myAssembled);
				char myGender = this.bikeArray[i].getGender();
				selectedBikes[i].setGender(myGender);
				counter++;
			}

		}
		// Return the new array
		return selectedBikes;
	}

	/**
	 * Finds the bikes with the desired genders
	 * 
	 * @param number The number of bikes requested by the user
	 * @param gender The gender requested by the user
	 * @return An array of correct bicycles
	 */
	public Bicycle[] getChoices(int number, char gender)
	{

		// A counter to track how many bikes are collected
		int counter = 0;
		// A new array to store collected bikes
		Bicycle[] selectedBikes = new Bicycle[25];

		// Loops through the array given to find bikes that fit said criteria
		for (int i = 0; i < selectedBikes.length; i++)
		{
			/*
			 * If the given gender matches the requested gender and the users bike quota has
			 * not been met, make a deep copy of the bike in the given array in the new
			 * array
			 */
			if (gender == this.bikeArray[i].gender && counter < number)
			{
				selectedBikes[i] = new Bicycle();
				String myType = this.bikeArray[i].getType();
				selectedBikes[i].setType(myType);
				int myWheelSize = this.bikeArray[i].getWheelSize();
				selectedBikes[i].setWheelSize(myWheelSize);
				boolean myAssembled = this.bikeArray[i].isAssembled();
				selectedBikes[i].setAssembled(myAssembled);
				char myGender = this.bikeArray[i].getGender();
				selectedBikes[i].setGender(myGender);
				counter++;
			}

		}
		// Return the new array
		return selectedBikes;

	}

	/**
	 * Sorts through the inventory with all desired qualities
	 * 
	 * @param number    The number of bikes requested
	 * @param type      The types of bike requested
	 * @param wheelSize The wheel sizes of bikes requested
	 * @param assembled The assembly of bikes requested
	 * @param gender    The gender of bikes requested
	 * @return Returns an array of all qualifying bikes
	 */
	public Bicycle[] getChoices(int number, String type, int wheelSize, boolean assembled, char gender)
	{
		// A counter to track how many bikes are collected
		int counter = 0;
		// A new array to store collected bikes
		Bicycle[] selectedBikes = new Bicycle[25];

		// Loops through the array given to find bikes that fit said criteria
		for (int i = 0; i < selectedBikes.length; i++)
		{
			/*
			 * If the given criteria matches the requested criteria and the users bike quota
			 * has not been met, make a deep copy of the bike in the given array in the new
			 * array
			 */
			if (type.equals(this.bikeArray[i].type) && counter < number && wheelSize == this.bikeArray[i].wheelSize
					&& assembled == this.bikeArray[i].assembled && gender == this.bikeArray[i].gender
					&& counter < number)
			{
				selectedBikes[i] = new Bicycle();
				String myType = this.bikeArray[i].getType();
				selectedBikes[i].setType(myType);
				int myWheelSize = this.bikeArray[i].getWheelSize();
				selectedBikes[i].setWheelSize(myWheelSize);
				boolean myAssembled = this.bikeArray[i].isAssembled();
				selectedBikes[i].setAssembled(myAssembled);
				char myGender = this.bikeArray[i].getGender();
				selectedBikes[i].setGender(myGender);
				counter++;
			}

		}
		// Return the new array
		return selectedBikes;

	}

	/**
	 * Copies a Bicycle object
	 * 
	 * @return Returns a copy of the object
	 */
	public Bicycle[] getBikes()
	{
		// Makes a new bicycle copy of the same length
		Bicycle[] bicycleCopy = new Bicycle[this.bikeArray.length];
		// Loops through, assigning all the values of the original to the copy
		for (int i = 0; i < this.bikeArray.length; i++)
		{
			bicycleCopy[i] = new Bicycle();
			String myType = this.bikeArray[i].getType();
			bicycleCopy[i].setType(myType);
			int myWheelSize = this.bikeArray[i].getWheelSize();
			bicycleCopy[i].setWheelSize(myWheelSize);
			boolean myAssembled = this.bikeArray[i].isAssembled();
			bicycleCopy[i].setAssembled(myAssembled);
			char myGender = this.bikeArray[i].getGender();
			bicycleCopy[i].setGender(myGender);
		}

		// Returns a copy of the object
		return bicycleCopy;
	}

	public void readInventory()
	{
		// ***********************************************************************************
		// Do not change the code
		// below*******************************************************
		int index = 0; // Do not change*********
		try // Do not change*********
		{ // Do not change*********
			File f = new File("bicycle.txt"); // Do not change*********
			Scanner file = new Scanner(f); // Do not change*********
			while (file.hasNextLine()) // Do not change*********
			{ // Do not change*********
				String[] line = file.nextLine().split(","); // Do not change*********
				String type = line[0]; // Do not change*********
				int wheelSize = Integer.parseInt(line[1]); // Do not change*********
				boolean assembled = Boolean.parseBoolean(line[2]); // Do not change*********
				char gender = line[3].charAt(0); // Do not change*********
				// ***********************************************************************************
				// Use these values to create a Bicycle and add it to the array
				// Makes a new bicycle object and assigns it in bikeArray at the index
				this.bikeArray[index] = new Bicycle(type, wheelSize, assembled, gender);
				index++;
				// Add code above this line
			} // Do not change****************************************************************
		} catch (FileNotFoundException ife) // Do not change*********
		{ // Do not change*********
			System.out.println("Unable to open file."); // Do not change*********
			System.out.println("Closing the program."); // Do not change*********
		} catch (InputMismatchException misexc) // Do not change*********
		{ // Do not change*********
			System.out.println("Invalid data type."); // Do not change*********
		} // Do not change*********
	}
}
// **************************
