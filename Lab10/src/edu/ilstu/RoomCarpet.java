/*
 * Created on: Oct 25, 2022
 *
 * ULID: mdcarl2
 * ULID: lrbenn1
 * Class: IT 168 
 * 
 */
package edu.ilstu;

/**
 * A class used to manipulate the RoomDimensions Class and to set/get the cost
 * and calculate the total cost
 *
 * @author Michael Carlson and Logan Bennett
 *
 */
public class RoomCarpet
{

	private double cost;

	/**
	 * Constructor
	 * 
	 * @param uses RoomDimensions as an object class
	 */

	public RoomCarpet(RoomDimensions RoomDimensions, double cost)
	{
		this.cost = cost;

	}

	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * @return the total cost as a String
	 */

	public String toString()
	{

		return "Total Cost: " + this.cost;

	}

	/**
	 * @return calculates the total cost and returns its value
	 */

	public double totalCost(RoomDimensions RoomDimensions)
	{
		double totalCost = RoomDimensions.calculateArea() * this.cost;
		return totalCost;
	}

}
