package com.training.tests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.Student;
import com.training.samples.StudentList;

public class SecondTest {
	static StudentList obj1=null;
	StudentList list =null; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	  obj1 = new StudentList();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	list =new StudentList();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test1() {
		assertNotNull(obj1);
		
	}
	@Test
	public void test2() {
	 int actual = obj1.getNames().size();
	 assertEquals(3, actual);
		
	}
	@Test
	public void test3() {
	 int actual = obj1.getNames().size();
	 assertEquals(2, actual);
		
	}
	//StudentList list =null; 
	
	/*@Test
	public void test() { 
		StudentList list =new StudentList(); 
		int actual = list.getNames().size(); 
		assertEquals(3, actual);         }       */
	@Test 
	public void testStudentNotNull(){ 
		Object obj =list.getStudentList();
		assertNotNull(obj);
		} 
	@Test
	public void testSetAcceptDuplicate(){ 
		Student s1=new Student(101,"Ramesh"); 
		Student s2=new Student(101,"Ramesh");
		HashSet<Student> stud =new HashSet<Student>(); 
		stud.add(s1);             
		stud.add(s2);   
	
	list.setNameList(stud); 
	int actual = list.getNameList().size(); 
	assertEquals(1, actual); 
	
	}
	
	
	

}
