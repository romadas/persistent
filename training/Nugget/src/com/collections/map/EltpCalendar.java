package com.collections.map;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class EltpCalendar {
	public static void main(String args[]) throws ParseException{
		Date date = new Date();
		Date d = new Date(new SimpleDateFormat("dd/M/yyyy").parse("12/1/2019").getTime());
	
		System.out.println(date.toString());
		System.out.println(d.toString());
		System.out.println(date.toString()+d.toString());
		System.out.println(" date occurs after "+date.after(d));
		System.out.println("date occurs before "+date.before(d));
		System.out.println("compare two dates "+date.compareTo(d));
		System.out.println("timestramp of first date object "+date.toInstant().toString());
		
	}
}
