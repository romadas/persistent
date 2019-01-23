package com.psl.main;
import java.util.Date;

import com.psl.util.NumberContainer;
import com.psl.util.Stack;
public class Client {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>(10);
		Stack<Date> d = new Stack<Date>(5);
		s.push("today");
		s.push("is");
		s.push("tuesday");
		//s.push(new Date());compilation error 
		System.out.println(s.peek());
		String v = s.pop(); 
		
		//System.out.println(s.pop());
		NumberContainer<Double> dbls = new NumberContainer<Double>();
		NumberContainer<Long> lngs = new NumberContainer<Long>();
		dbls.hasSameAverage(lngs);
	}

}
