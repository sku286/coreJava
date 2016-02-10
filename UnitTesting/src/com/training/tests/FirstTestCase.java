/**
 * 
 */
package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.CurrencyConvertor;

/**
 * @author sku286
 *
 */
public class FirstTestCase {

	
	CurrencyConvertor conv =null;
	@BeforeClass
	
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Called Once Before Class");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Called After All Tests are Completed");
	}

	
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before Called **********");
		conv = new CurrencyConvertor();
	}

	
	@After
	public void tearDown() throws Exception {
		System.out.println("After Called **********");
	}

	@Test
	public void test1() {
		//fail("test 1 Not yet implemented");
		//CurrencyConvertor conv = new CurrencyConvertor();
		double actual = conv.dollarToRupees(25);
		assertEquals(2500,actual,1);
	}
	@Test
	public void test2() {
		/*fail("test 2 Not yet implemented");*/
		Double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}

}
