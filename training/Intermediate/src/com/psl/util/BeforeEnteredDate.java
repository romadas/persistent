package com.psl.util;

import java.util.Comparator;
import java.util.Date;

public class BeforeEnteredDate implements Comparator<Employee> {



	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDate().compareTo(o2.getDate());
	
	}

}
