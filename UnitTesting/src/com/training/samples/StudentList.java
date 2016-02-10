package com.training.samples;

import java.util.HashSet;
import java.util.Set;

public class StudentList {
	
	Set<String> names;
	Set<Student> namelist;
	public StudentList(){
		names = new HashSet<String>();
		//namelist = new HashSet<Student>();
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Ramesh");
		//namelist.add("hj");
		
	}
	public Set<String> getNames(){
		
		return names;
	}
	public Set<Student> getStudentList()
	{ 
		return namelist; 
		} 
	public Set<Student> getNameList() 
	{ 
		return namelist; 
		} 
        public void setNameList(Set<Student> nameList)
        {
                   this.namelist = nameList;       
         }
        

}
