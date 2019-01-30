package com.psl.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

import com.psl.util.BeforeEnteredDate;
import com.psl.util.Employee;
import com.psl.util.JoiningComparator;

public class EmployeeDemo {

	public static void main(String[] args) throws ParseException {
		EmployeeDemo emd = new EmployeeDemo();
		TreeSet<Employee> emp = new TreeSet<Employee>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		emp.add(new Employee(1,"roma",sdf.parse("10/10/2018")));
		emp.add(new Employee(2,"astha",sdf.parse("10/07/2019")));
		emp.add(new Employee(3,"khushboo",sdf.parse("10/03/2017")));
		emp.add(new Employee(4,"shivanee",sdf.parse("10/10/2017")));
		emd.displayInformation(emp);
		emd.sortJoiningDate(emp);
		emd.beforeEnteredDate(sdf.parse("12/10/2018"),emp);
		emd.completedSixMonths(emp);
	}



	private void displayInformation(TreeSet<Employee> emp) throws ParseException {
		System.out.println("display employee information");
		Iterator itr = emp.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	private void sortJoiningDate(TreeSet<Employee> emp) {
		System.out.println("sort according to joining date");
		TreeSet<Employee> sort1 = new TreeSet<Employee>(new JoiningComparator());
		sort1.addAll(emp);
		Iterator itr = sort1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	
	}
	
	private void beforeEnteredDate(Date date, TreeSet<Employee> emp) throws ParseException {
		System.out.println("joined before entered date");
		for(Employee e:emp){
			if(date.compareTo(e.getDate())>0)
				System.out.println(e);
		}
		
	}

	private void completedSixMonths(TreeSet<Employee> emp) {
		System.out.println("completed six months");
		SimpleDateFormat date = new SimpleDateFormat();
		//date.
		
	}


}
