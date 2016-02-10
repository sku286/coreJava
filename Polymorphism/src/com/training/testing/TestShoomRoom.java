package com.training.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.Interf.Automobiles;
import com.training.Interf.LuxuryCar;
import com.training.Interf.PassengerCar;
import com.training.Interf.ShowRoom;
import com.training.Interf.ShowRoom1;
import com.training.Interf.SportsBike;
import com.training.Interf.SportsCar;

public class TestShoomRoom {

	ShowRoom1 show1= null;
	Automobiles polyAuto = null;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		show1= new ShowRoom1();
		polyAuto=show1.getItem(3);
		assertTrue(polyAuto instanceof SportsCar );
		
	}
	@Test
	public void test1() {
		show1= new ShowRoom1();
		polyAuto=show1.getItem(1);
		assertTrue(polyAuto instanceof PassengerCar );
		
	}
	@Test
	public void test2() {
		show1= new ShowRoom1();
		polyAuto=show1.getItem(1);
		assertTrue(polyAuto instanceof LuxuryCar );
		
	}
	@Test
	public void test4() {
		show1= new ShowRoom1();
		polyAuto=show1.getItem(4);
		assertTrue(polyAuto instanceof SportsBike );
		
	}
	@Test
	public void test5() {
		show1= new ShowRoom1();
		polyAuto=show1.getItem(4);
		assertNull(polyAuto);
		
	}
	@Test
	public void test6() {
		show1= new ShowRoom1();
		polyAuto=show1.getItem(4);
		assertEquals(polyAuto.getClass(), SportsBike.class);
		
	}

}
