/**
 * 
 */
package com.beans;

import java.util.Comparator;

/**
 * @author roma_das
 *
 */
public class PriceComparator implements Comparator<Peripheral>{

	@Override
	public int compare(Peripheral o1, Peripheral o2) {
	
		return o1.getPrice()-o2.getPrice();
	}

}
