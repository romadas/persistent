package com.collections.map;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("calender time: "+cal.getTime());
		System.out.println("gregorian time: "+gc.getTime());
		cal.add(Calendar.DATE, 10);
		System.out.println(cal.getTime());
		System.out.println("week : "+Calendar.WEEK_OF_YEAR);
		System.out.println("month : "+Calendar.MONTH);
		System.out.println("year:"+Calendar.YEAR);
		cal.roll(Calendar.YEAR, -1);
		System.out.println(cal.getTime());
	}
}
