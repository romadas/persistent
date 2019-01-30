package com.psl.mpc;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1782257829021381010L;
	private String empid;
	
	public Employee(String empid) {
		super();
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + "]";
	}
	
	
}
