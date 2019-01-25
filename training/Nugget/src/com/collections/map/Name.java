package com.collections.map;

import java.util.Vector;

public class Name {
	String fname;
	String lname;
	
	public Name(){
		super();
		this.fname=null;
		this.lname=null;
	}
	
	
	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getFullname(){
		return fname+" "+lname;
	}
	
	
	
	
}
