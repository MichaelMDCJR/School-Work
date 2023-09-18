/*
 * Created on: Aug 30, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * Experiments with which variables can be assigned to each other and how each
 * interacts with the others
 *
 * @author Michael Carlson
 *
 */
public class Experiments
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		// Shorts can't be longs, ints, floats, or doubles
		// Longs can be shorts and ints, but not floats or doubles
		// Ints can be shorts, but not longs, floats, or doubles
		// Floats can be shorts, longs, ints, but not doubles
		// Doubles can be shorts, longs, ints, and floats

		short aShort = 6;
		long aLong = 105;
		int int1 = 10;
		int int2 = 11;
		float aFloat = 1.5f;
		double aDouble = 100.3;

		aDouble = int2 / 2;
		System.out.println("aDouble = int2 / 2; results in: " + aDouble);
		aDouble = int2 / 2.0;
		System.out.println("aDouble = int2 / 2.0; results in: " + aDouble);
		aLong = int1 % 2;
		System.out.println("aLong = int1 % 2; results in: " + aLong);
		aLong = int1 % 4;
		System.out.println("aLong = int1 % 4; results in: " + aLong);
		int1 = int2 % 2;
		System.out.println("int1 = int2 % 2; results in: " + int1);
		int1 = int2 % 3;
		System.out.println("int1 = int2 % 3; results in: " + int1);
		int1 = int2 % 4;
		System.out.println("int1 = int2 % 4; results in: " + int1);
		int1 = 2 + 3 * 4;
		System.out.println("int1 = 2 + 3 * 4; results in: " + int1);
		int1 = (2 + 3) * 4;
		System.out.println("int1 = (2 + 3) * 4; results in: " + int1);

	}

}
