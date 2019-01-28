package com.psl.util;

import java.util.Comparator;

public class DurationComaparator implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		
		return o1.getDuration().compareTo(o2.getDuration());
	}
	

}
