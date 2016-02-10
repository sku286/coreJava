package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.BankAccount;

public class BankTest {

	
	BankAccount obj1=new BankAccount();
	@Before
	public void setUp() throws Exception {
		//obj = new BankAccount(12365478,"ram", 456);
		//obj1 = new BankAccount(12365478L,null, 456);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test(expected=NullPointerException.class)
	public void testNullCheckName() throws Exception{	
		//assertNotNull(obj1.getAccountHolderName());	
		obj1 = new BankAccount(12365478L,null, 456);
	}
	@Test
	public void checkAccNumber(){
		
		obj1 = new BankAccount(12365478L,"jg", 456);
		long accno =obj1.getAccountNumber();
		//assertTrue(accno>0);
		assertEquals(12365478L, accno);
		
	}
	@Test
	public void checkbalance(){
		obj1 = new BankAccount(12365478L,"jg", 456);
		double accbalance = obj1.getBalance();
		assertTrue("Balnace not set", accbalance>0);
		
	}
	@Test
	public void testdeposit()
	{
		obj1 = new BankAccount(12365478L,"suresh", 456);
		obj1.deposit(500);
		double actual = obj1.getBalance();
		
		assertEquals(956, actual+500,0);
	}
	@Test(expected = NullPointerException.class)
	public void testWithdraw(){
		
		obj1 = new BankAccount(12365478L,"suresh", 456);
		obj1.withdraw(-500);
		double actual=obj1.getBalance();
		assertTrue(actual>0);
				
	}
	@Test
	public void testWithdraw1(){
		
		obj1 = new BankAccount(12365478L,"suresh", 456);
		obj1.withdraw(-500);
		double actual=obj1.getBalance();
		assertTrue(actual>0);
	}
	
	
	

	

}
