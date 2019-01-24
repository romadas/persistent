package com.collections.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericELTP {
	public static void main(String args[]){
		List<String> str;
		str = new ArrayList<String>();
		str.add("abc");
		str.add("def");
		str.add("ghi");
		Iterator<String> itr = str.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(str.get(0));
	
	}
}
