package com.cisc181.core;

import static org.junit.Assert.*;

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

	
	public Staff_Test(){
		Staff member1 = new Staff("Bob", "Francis", "Smith", 01/01/1980, "123 Main St.", "800-123-4567", "bsmith@hotmail.com", "Wednesdays 2-5", 3, 65000.00, 01/01/2010, "MR" );
	}
}
