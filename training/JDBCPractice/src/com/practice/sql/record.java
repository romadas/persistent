package com.practice.sql;

public class record {
	private String roll_no;
	private String name;
	private String grade;
	
	
	public record() {
		super();
	}


	public record(String roll_no, String name, String grade) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.grade = grade;
	}


	public String getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
