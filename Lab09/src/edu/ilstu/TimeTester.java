/*
 * Created on: Oct 18, 2022
 *
 * ULID: mdcarl2
 * ULID: idstrei
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author Michael Carlson Isaiah Streitmatter
 * 
 */
public class TimeTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Time time1 = new Time(2, 30);
		System.out.println("result should be: time1 object created with hours: 2 and minutes: 30");
		System.out.println(time1.toString());

		Time time2 = new Time(2, 45, "PM");
		System.out.println("result should be: time1 object created with hours: 14 and minutes: 45");
		System.out.println(time2.toString());

		Time time3 = new Time(14, 45);
		System.out.println("result should be: time1 object created with hours: 14 and minutes: 45");
		System.out.println(time3.toString());

		Time time4 = new Time(25, 50);
		System.out.println(
				"result should be: time4 object created with hours: 0 and minutes: 0  (midnight – because of invalid input)");
		System.out.println(time4.toString());

		time3.setMinutes(68);
		System.out.println("result should be: time object not changed because of invalid input.");
		System.out.println(time3.getMinutes());

		System.out.println("result should be: true printed to console");
		System.out.println(time3.equals(time2));

		System.out.println("result should be: 14:45  printed to console");
		System.out.println(time3);

		System.out.println("result: 2:45 PM  printed to console");
		System.out.println(time3.get12HourTime());

		System.out.println();

		// 12 Hour time
		System.out.println("result should be: 2:45 pm");
		System.out.println(time3.get12HourTime());

		System.out.println("result should be: 0:00 am");
		System.out.println(time4.get12HourTime());

		// Get Minutes
		System.out.println("result should be: getting time1 minutes: 30");
		System.out.println(time1.getMinutes());

		System.out.println("result should be: getting time1 minutes: 45");
		System.out.println(time2.getMinutes());

		// sethours and getHours
		System.out.println("result should be: set time2 hours to 10");
		time2.setHours(10);
		System.out.println(time2.getHours());

		System.out.println("result should be: set time4 hours to 15");
		time4.setHours(15);
		System.out.println(time4.getHours());

		// Equals
		System.out.println("result: test equals between time1 and time2: will output false");
		System.out.println(time1.equals(time2));

		System.out.println("result: test equals between time3 and time4: will output false");
		System.out.println(time3.equals(time4));

		// getMinutes and setMinutes
		System.out.println("result: sets time2 minutes to 16");
		time2.setMinutes(16);
		System.out.println(time2.getMinutes());

		System.out.println("result: sets time4 minutes to 37");
		time4.setMinutes(37);
		System.out.println(time4.getMinutes());

		// toString
		System.out.println("result: prints time4 in military time: 15:37");
		System.out.println(time4.toString());

		System.out.println("result: prints time1 in military time: 2:30");
		System.out.println(time1.toString());
	}

}
