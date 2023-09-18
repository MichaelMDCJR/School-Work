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
 * A class testing the BankAccount class
 *
 * @author Michael Carlson and Logan Bennett
 *
 */
public class TryIt
{

	int test = 10;

	static void TestTempVars()
	{
		// C
		BankAccount myAccount = new BankAccount(500, "Mike Jones", "555555");
		System.out.println("Original value of account: " + myAccount);

		// E
		objectPassing(myAccount);
		System.out.println("Value of bank account after objectPassing executes: " + myAccount);

		// F
		int var = 10;
		System.out.println("Initial value of var: " + var);

		// H
		primitivePassing(var);
		System.out.println("Value of original int var after primitive Passing executes: " + var);
	}

	static void objectPassing(BankAccount acct)
	{
		// D
		acct.deposit(200);
		System.out.println("Value of bank account in objectPassing: " + acct);
	}

	static void primitivePassing(int myint)
	{
		// G
		myint -= 5;
		System.out.println("primitivePassing value of var: " + myint);
	}

	public static void main(String[] args)
	{
		String string1 = "Hello";
		String string2 = "Hello";
		String string3 = "Helllloooo";

		System.out.println(
				"We are testing the == operator and the .equals method. The output should be true, false, true, false");

		if (string1 == string2)
		{
			System.out.println("== works for different strings with the same content (Output true)");
		} else
		{
			System.out.println("== doesn't work for different strings with the same content (Output false)");
		}

		if (string1 == string3)
		{
			System.out.println("== works for different strings with the different content (Output true)");
		} else
		{
			System.out.println("== doesn't work for different strings with the different content (Output false)");
		}

		if (string1.equals(string2))
		{
			System.out.println(".equals works for different strings with the same content (Output true)");
		} else
		{
			System.out.println(".equals doesn't work for different strings with the same content (Output false)");
		}

		if (string1.equals(string3))
		{
			System.out.println(".equals works for different strings with the different content (Output true)");
		} else
		{
			System.out.println(
					".equals doesn't work for different strings with the different content (Output false)" + "\n");
		}

		String stringA = new String("Bye");
		String stringB = new String("Bye");
		String stringC = new String("Byeeeeeee");

		System.out.println(
				"We are testing the == operator and the .equals method when creating a string with a constructor. The output should be true, false, true, false");

		if (stringA == stringB)
		{
			System.out.println("== works for different strings with the same content (Output true)");
		} else
		{
			System.out.println("== doesn't work for different strings with the same content (Output false)");
		}

		if (stringA == stringC)
		{
			System.out.println("== works for different strings with the different content (Output true)");
		} else
		{
			System.out.println("== doesn't work for different strings with the different content (Output false)");
		}

		if (stringA.equals(stringB))
		{
			System.out.println(".equals works for different strings with the same content (Output true)");
		} else
		{
			System.out.println(".equals doesn't work for different strings with the same content (Output false)");
		}

		if (stringA.equals(stringC))
		{
			System.out.println(".equals works for different strings with the different content (Output true)");
		} else
		{
			System.out.println(
					".equals doesn't work for different strings with the different content (Output false)" + "\n");
		}

		// Explanation of question 1
		System.out.println(
				"The .equals method should be used when comparing strings because when creating a string with a constructor, you can have "
						+ "two the of the same string that output as different with the == operator, when .equals() catches it as true.\n");
		TestTempVars();

		// Explanation of question 2
		System.out.println(
				"\nAnswer to question 2: When changing the values of of variables passed through a function, the origianl "
						+ "function does not recieve the changes because of its limited scope.\n");

		// Explanation of question 3
		System.out.println(
				"Anser to question 3: When passing a primitive variable and changing it in a function, the value is not changed "
						+ "in the calling method because of scope.");
	}

}
