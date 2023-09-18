/*
 * Created on: Nov 17, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * A class that makes, gets, sets, and returns strings of Bicycle objects
 *
 * @author Michael Carlson
 *
 */
public class Bicycle
{
	public String type;
	public int wheelSize;
	public boolean assembled;
	public char gender;

	/**
	 * Default Constructor
	 */
	public Bicycle()
	{

	}

	/**
	 * Constructor
	 * 
	 * Makes a bicycle object with given values
	 * 
	 * @param type      The type to be assigned in the new bicycle
	 * @param wheelSize The wheel size to be assigned in the new bicycle
	 * @param assembled The assembly to be assigned in the new bicycle
	 * @param gender    The gender to be assigned in the new bicycle
	 */
	public Bicycle(String type, int wheelSize, boolean assembled, char gender)
	{
		this.type = type;
		this.wheelSize = wheelSize;
		this.assembled = assembled;
		this.gender = gender;
	}

	/**
	 * Constructor
	 * 
	 * Makes a bicycle object with another bicycle
	 * 
	 * @param bicycle A bicycle object is passed through, and is assigns it to a new
	 *                bicycle
	 */
	public Bicycle(Bicycle bicycle)
	{
		this.type = bicycle.getType();
		this.wheelSize = bicycle.getWheelSize();
		this.assembled = bicycle.isAssembled();
		this.gender = bicycle.getGender();
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @return the wheelSize
	 */
	public int getWheelSize()
	{
		return wheelSize;
	}

	/**
	 * @return the assembled
	 */
	public boolean isAssembled()
	{
		return assembled;
	}

	/**
	 * @return the gender
	 */
	public char getGender()
	{
		return gender;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @param wheelSize the wheelSize to set
	 */
	public void setWheelSize(int wheelSize)
	{
		this.wheelSize = wheelSize;
	}

	/**
	 * @param assembled the assembled to set
	 */
	public void setAssembled(boolean assembled)
	{
		this.assembled = assembled;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender)
	{
		this.gender = gender;
	}

	/**
	 * Formats the given string with correct labels
	 */
	public String toString()
	{
		String fullGender = "Male";
		if (this.getGender() == 'f')
		{
			fullGender = "Female";
		}
		return "Type: " + this.getType() + " Size: " + this.getWheelSize() + " Assembled: " + this.isAssembled()
				+ " Gender: " + fullGender;
	}
}
