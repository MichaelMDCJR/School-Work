/*
 * Created on: Oct 18, 2022
 *
 * ULID: mdcarl2
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * Creates and alters two Student objects
 *
 * @author Michael Carlson
 *
 */
public class CollegeThings
{

	public static void main(String[] args)
	{
		// Creates two new Student objects
		Student Marge = new Student("Marge Worten", "English Major", 3.4, 63);
		Student Clark = new Student("Clark Smith", "Biology Major");

		// Prints Marge's name and class level
		Marge.printClassLevel();

		// Changes Clark's major to physics
		Clark.setMajor("Physics Major");

		// Updates both students with current semester credit hours and GPA
		Marge.updateStudent(14, 3.6);
		Clark.updateStudent(10, 3.8);

		// Prints the updated student details
		Marge.print();
		Clark.print();
	}

}
