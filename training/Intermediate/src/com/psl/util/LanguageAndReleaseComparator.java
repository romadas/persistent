package com.psl.util;

import java.util.Comparator;

public class LanguageAndReleaseComparator implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		int Result = o1.getLanguage().compareTo(o2.getLanguage());
		
		if(Result == 0){
			return o1.getrelease_date().compareTo(o2.getrelease_date());
		}
		return Result;
	}

}
