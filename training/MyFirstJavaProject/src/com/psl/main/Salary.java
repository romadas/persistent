package com.psl.main;

public class Salary {
	public static void main(String args[]){
		double salary = 1000.0;
		double dearness_allowance , house_rent, gross_salary, income_tax, net_salary;
		dearness_allowance = ((0.1) * salary);
		house_rent = ((0.07) * salary);
		gross_salary = (salary + dearness_allowance + house_rent);
		income_tax = ((0.08) * gross_salary);
		net_salary = (gross_salary - income_tax);
		System.out.println("dearness_allowance " + dearness_allowance + "house_rent " + house_rent + "gross_salary " + gross_salary + "income_tax " + income_tax + "net_salary " +net_salary );
	}

}
