package com.psl.test;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.util.Utility;

//test class
public class UtilityTest {
	private Utility utility;
	@BeforeClass//called only once
	public static void setupForTestClass(){
		
	}
	@AfterClass
	public static void cleanupForTestClass(){
		
	}
	
	@Before//called several times
	public void setupForTestMethod(){
		utility = new Utility();
	}
	@After
	public void cleanupAfterTestMethod(){
		
	}
	@Test//timeout = before test method actual method to be tested and time to wait for the execution and if time is out test is terminated and considered to be failure
	//expected used for exception testing
	public void testFactorial_1(){
		
		int number = 3;
		long expectedResult = 6,actualResult;
		
		actualResult =  utility.factorial(number);
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testFactorial_2(){
		int number = 7;
		long expectedResult =5040 ,actualResult;
		
		actualResult =  utility.factorial(number);
		Assert.assertEquals(expectedResult, actualResult);
			
	}
	@Test
	public void testFactorial_3(){
		int number = 5;
		long expectedResult = 120,actualResult;
		
		actualResult =  utility.factorial(number);
		Assert.assertEquals(expectedResult, actualResult);
		
	}
}
