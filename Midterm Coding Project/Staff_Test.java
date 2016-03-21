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
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

	
	public void Staff_Test(){
		Staff staff1 = new Staff(MR);
		Staff staff2 = new Staff(MRS);
		Staff staff3 = new Staff(MR);
		Staff staff4 = new Staff(MS);
		Staff staff5 = new Staff(MRS);
		
		double salary1 = 60000.00;
		double salary2 = 70000.00;
		double salary3 = 65000.00;
		double salary4 = 80000.00;
		double salary5 = 75000.00;
		
		
		
	}
}
