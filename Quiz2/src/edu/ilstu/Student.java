package edu.ilstu;

import java.text.DecimalFormat;

/*
 * Student.java
 * Created on Oct 5, 2004
 * By Mary Elaine Califf
 *
 */

/**
 * Student class maintains information about a particular student
 * 
 * @author Mary Elaine Califf
 */
public class Student
{
	private String name;
	private String major;
	private double gpa;
	private int hoursCompleted;

	/**
	 * Constructor
	 * 
	 * @param name  The student's name
	 * @param major The student's major
	 */
	public Student(String name, String major)
	{
		this.name = name;
		this.major = major;
		this.gpa = 0.0;
		hoursCompleted = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param name           The student's name
	 * @param major          The student's major
	 * @param gpa            The student's cumulative gpa
	 * @param hoursCompleted Number of credit hours the student has completed
	 */
	public Student(String name, String major, double gpa, int hoursCompleted)
	{
		this.name = name;
		this.major = major;
		this.gpa = gpa;
		this.hoursCompleted = hoursCompleted;
	}

	/**
	 * @return The student's major.
	 */
	public String getMajor()
	{
		return major;
	}

	/**
	 * @param major The major to set.
	 */
	public void setMajor(String major)
	{
		this.major = major;
	}

	/**
	 * @return The student's name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return The student's gpa.
	 */
	public double getGpa()
	{
		return gpa;
	}

	/**
	 * @return The number of credit hours the student has completed.
	 */
	public int getHoursCompleted()
	{
		return hoursCompleted;
	}

	/**
	 * @return The student's class (Freshman, Sophomore, Junior, Senior)
	 */
	public String getClassLevel()
	{
		String classLevel;
		if (hoursCompleted < 30)
		{
			classLevel = "Freshman";
		} else if (hoursCompleted < 60)
		{
			classLevel = "Sophomore";
		} else if (hoursCompleted < 90)
		{
			classLevel = "Junior";
		} else
		{
			classLevel = "Senior";
		}
		return classLevel;
	}

	/**
	 * Update student's information to reflect completion of a semester's work
	 * 
	 * @param semHours Number of credit hours the student has just completed
	 * @param semGPA   GPA for the semester just completed
	 */
	public void updateStudent(int semHours, double semGPA)
	{
		int oldHours = hoursCompleted;
		hoursCompleted = oldHours + semHours;
		gpa = (oldHours * gpa + semHours * semGPA) / hoursCompleted;
	}

	/** Print the student's name and class */
	public void printClassLevel()
	{
		System.out.println(name + " is a " + getClassLevel());
	}

	/**
	 * Prints the information about a student in a nice format with appropriate
	 * labeling
	 */
	public void print()
	{
		DecimalFormat fmt = new DecimalFormat("0.000");
		System.out.println(name + " is a " + getClassLevel() + " " + major);
		System.out.print("who has completed " + hoursCompleted + " hours ");
		System.out.println("with a " + fmt.format(gpa) + " gpa.");
	}
}
