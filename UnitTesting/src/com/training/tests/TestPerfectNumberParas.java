package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.perfect.PerfectNumber;

@RunWith(Parameterized.class)
public class TestPerfectNumberParas
{
	private int numbers;
		 
		   public TestPerfectNumberParas(int numbers) {
			this.numbers=numbers;
		}
		 
	
	
	@Test
	public void testPerfectByParam(){
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.isPerfectNumber(numbers);
		assertTrue(numbers+"is not perfect number", actual);
	}
	@Parameters
	public static Collection<Object> data(){
		Object[] data = new Object[]{6,28,33,44};
		return Arrays.asList(data);
	}
	

}
