package com.facebook.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class FaceBookUnitTest {

	
	@Test
	public void getIdTest() {
		// Create the Object and call the method
		assertEquals(1, 1);
	}
	
	@Before
	@Test
	public void beforeTest() {
		System.out.println("********before*");
		
	}
	@Test
	public void test() {
		System.out.println("********test*");
		
	}
	@After
	@Test
	public void afterTest() {
		System.out.println("********after*");
		
	}
	@AfterClass
	public static String afterClassTest() {
		System.out.println("********afterclass*");
		return null;
		
	}
	

}
