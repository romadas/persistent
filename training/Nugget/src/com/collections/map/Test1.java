package com.collections.map;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
	public static void main(String args[]){
		List<String> str = new ArrayList<String>();
		str.add("roma");
		str.add("astha");
		str.add("shivanee");
		str.add("khusbhoo");
		
		for(String s : str){
			System.out.println(s);
		}
		if(str.contains("astha")){
			System.out.println("name present");
		}
	}
}
