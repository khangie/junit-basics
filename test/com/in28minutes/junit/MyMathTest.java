package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sumWith3Numbers() {
		System.out.println("Test1");
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);
	}
	
	@Test
	public void sumWith1Number() {
		System.out.println("Test2");
		int result = myMath.sum(new int[] {3});
		assertEquals(3, result);
	}

}
