package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.perfect.PerfectNumber;

public class TestPerfectNumber {

	PerfectNumber obj = new PerfectNumber();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testPositiveNumber() {
		obj =new PerfectNumber(1);
         assertTrue(obj.getNumber()>0);
	}
	
	@Test
	public void testNumberIsPerfect() {
		obj =new PerfectNumber(6);
		int no = obj.getNumber();
		assertTrue(obj.isPerfectNumber(no));
	}
	@Test
	public void testNumberNotPerfect() {
		obj =new PerfectNumber(8);
		int no = obj.getNumber();
		assertTrue(obj.isPerfectNumber(no));
	}
	@Test(timeout=100)
	public void testInfiniteLoop() {
		obj =new PerfectNumber(8);
		int no = obj.getNumber();
		assertTrue(obj.isPerfectNumber(no));
	}
	
	

}
