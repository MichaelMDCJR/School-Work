/*
 * Created on: Oct 18, 2022
 *
 * ULID: mdcarl2
 * ULIDL idstrei
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * Creates a time class with various methods for setting and calling time
 *
 * @author Michael Carlson, Isaiah Streitmatter
 *
 */
public class Time
{
	private int hours;
	private int minutes;

	/*
	 * Constructor
	 */
	public Time()
	{
		this.hours = 0;
		this.minutes = 0;
	}

	/*
	 * Constructor
	 * 
	 * @param clockHours Stores hours in military time
	 * 
	 * @param clockMinutes Stores minutes
	 */
	public Time(int clockHours, int clockMinutes)
	{
		if (clockHours >= 0 && clockHours <= 23 && clockMinutes >= 0 && clockMinutes <= 59)
		{
			this.hours = clockHours;
			this.minutes = clockMinutes;
		} else
		{
			this.hours = 0;
			this.minutes = 0;
		}
	}

	/*
	 * Constructor
	 * 
	 * @param clockHours Stores the hours in military time
	 * 
	 * @param clockMinutes Stores the minutes
	 * 
	 * @param amPM Stores the meridiem
	 */
	public Time(int clockHours, int clockMinutes, String amPM)
	{
		if (clockHours >= 0 && clockHours <= 12 && clockMinutes >= 0 && clockMinutes <= 60
				&& (amPM == "am" || amPM == "pm" || amPM == "PM" || amPM == "AM"))
		{
			if (amPM == "PM" || amPM == "pm")
			{
				this.hours = clockHours + 12;
			} else
			{
				this.hours = clockHours;
			}
			this.minutes = clockMinutes;

		} else
		{
			this.hours = 12;
			this.minutes = 0;

		}
	}

	/*
	 * Gets the hours
	 * 
	 * @return gets the hours
	 */
	public int getHours()
	{
		return hours;
	}

	/*
	 * Sets the hours
	 * 
	 * @param hours sets the hours
	 */
	public void setHours(int hours)
	{
		if (hours <= 24)
		{
			this.hours = hours;
		}
	}

	/*
	 * Gets the minutes
	 * 
	 * @return gets the minutes
	 */
	public int getMinutes()
	{
		return minutes;
	}

	/*
	 * Sets the minutes
	 * 
	 * @param minutes Sets the minutes
	 */
	public void setMinutes(int minutes)
	{
		if (minutes <= 59)
		{
			this.minutes = minutes;
		}
	}

	/*
	 * Compares two time objects
	 * 
	 * @param timeClock the object being passed
	 * 
	 */
	public boolean equals(Time timeClock)
	{

		if (this.minutes == timeClock.getMinutes() && this.hours == timeClock.getHours())
		{
			return true;
		} else
		{
			return false;
		}
	}

	/*
	 * Returns the time in military format with colon
	 * 
	 * @return returns the time in military time
	 */
	public String toString()
	{
		return this.hours + ":" + this.minutes;
	}

	/*
	 * Returns the time in a 12 hour format
	 * 
	 * @return Returns the time in a 12 hour format
	 */
	public String get12HourTime()
	{
		if (this.hours < 12)
		{
			return this.hours + ":" + this.minutes + "am";
		} else
		{
			this.hours = this.hours - 12;
			return this.hours + ":" + this.minutes + "pm";
		}
	}

}
