/*
 * Created on: Oct 25, 2022
 *
 * ULID: mdcarl2
 * ULID: lrbenn1
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * Class for making, getting, setting, and calculating the area of the class
 * RoomDimension
 *
 * @author Michael Carlson and Logan Bennet
 *
 */
public class RoomDimensions
{
	private double length;
	private double width;

	/**
	 * Constructor
	 * 
	 * @param length and width given by user
	 */
	public RoomDimensions(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength()
	{
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length)
	{
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth()
	{
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width)
	{
		this.width = width;
	}

	/**
	 * @return a string with the length and width
	 */
	public String toString()
	{
		return "Length: " + this.length + " Width: " + this.width;
	}

	/**
	 * @return the area
	 */
	public double calculateArea()
	{
		double area = (this.length * this.width);
		return area;
	}

}
