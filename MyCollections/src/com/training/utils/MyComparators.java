package com.training.utils;

import java.util.*;

import com.training.domain.Doctor;
public class MyComparators {

//inner Class -used	
	public class NameComparator implements Comparator<Doctor>{

		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			//String class already implements Comparable
			//Doctor Class is Encapsulated hence using getter Method
			return o1.getDoctorName().compareTo(o2.getDoctorName());
		}
		
	}
	
	
	public class SpecializationComparator implements Comparator<Doctor>{

		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			return o1.getSpecialization().compareTo(o2.getSpecialization());
		}
		
		
	}
}
