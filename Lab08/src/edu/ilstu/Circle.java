/*
 * Created on: Oct 11, 2022
 *
 * ULID:mdcarl2
 * ULID:lrbenn1
 * ULID:smventr
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * Creates a Circle class with methods to calculate the area, diameter, and
 * circumference Also has the ability to set the radius and get the radius
 *
 * @author Michael Carlson, Logan Bennett, Salvatore Ventrone
 *
 */
public class Circle
{
	// Variables for Circle Class
	private double radius;
	private final double PI = 3.14159;

	/*
	 * Constructor
	 * 
	 * @param circleRadius Stores a circles radius
	 */

	public Circle(double circleRadius)
	{
		this.radius = circleRadius;
	}

	/*
	 * Gets the radius
	 * 
	 * @return getRadius returns the radius
	 */

	public double getRadius()
	{
		return this.radius;
	}

	/*
	 * Sets the radius
	 * 
	 * @param setRadius sets the radius
	 */

	public void setRadius(double circleRadius)
	{
		this.radius = circleRadius;
	}

	/*
	 * Calculates the circle area
	 * 
	 * @return returns the circle area
	 */

	public double calculateArea()
	{
		return PI * this.radius * this.radius;
	}

	/*
	 * Calculates the Diameter
	 * 
	 * @return returns the circle diameter
	 */

	public double calculateDiameter()
	{
		return this.radius * 2;
	}

	/*
	 * Gets the Circumference
	 * 
	 * @return returns the circle circumference
	 */

	public double calculateCircumference()
	{
		return 2 * PI * this.radius;
	}

}
