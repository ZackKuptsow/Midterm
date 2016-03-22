package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.eNums.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	public void Staff_Test(){
		Staff staff1 = new Staff(MR);
		Staff staff2 = new Staff(MRS);
		Staff staff3 = new Staff(MR);
		Staff staff4 = new Staff(MS);
		Staff staff5 = new Staff(MRS);
		
		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		
		double salary1 = 60000.00;
		double salary2 = 70000.00;
		double salary3 = 65000.00;
		double salary4 = 80000.00;
		double salary5 = 75000.00;
		
		ArrayList<Salary>salaries = new ArrayList<Salary>();
		salaries.add(salary1);
		salaries.add(salary2);
		salaries.add(salary3);
		salaries.add(salary4);
		salaries.add(salary5);
		
	}
	
	@Test
	public void Staff_Test() {
		double sum = 0;
		double average = 0;
		
		for(Staff s : staff){
			sum += s.getSalary();
			average = sum / staff.size();
		}
		
	}	
}
