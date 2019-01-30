package com.beans;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Peripheral>{

	@Override
	public int compare(Peripheral o1, Peripheral o2) {
		int result = o1.getQuantity()-o2.getQuantity();
		if(result==0){
			result = o1.getPrice()-o2.getPrice();
		}
		return result;
	}

}
