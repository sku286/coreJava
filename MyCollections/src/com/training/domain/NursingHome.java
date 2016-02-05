package com.training.domain;
import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {
	
	private ArrayList<Doctor> doctorlist;

	public NursingHome() {
		
		doctorlist = new ArrayList<Doctor>();
	}
	public boolean addDoctor(Doctor doc)
	{
		boolean result =false;
		result = doctorlist.add(doc);
		return result;
	}
	
	public void printDoctorList(){
		
		for (Doctor doc : doctorlist)
		{
			System.out.println(doc);  //.getDoctorId()+":"+doc.getDoctorName()+":"+doc.getSpecialization());
			if(doc.getPatients()!=null)
			{
			System.out.println("Appointments");
			for(Patient pat:doc.getPatients())
				System.out.println(pat);
			}
		}
	}
	
	public void printSortedList()
	{
		Collections.sort(doctorlist);
		printDoctorList();
		
		
	}
	MyComparators comp = new MyComparators();
	
	public void printSortedList(int i){
		switch (i)
		{
		case 1:
			printSortedList();
			break;

		case 2:
			
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(doctorlist,comp1);
			printDoctorList();
			break;
		case 3:
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(doctorlist,comp2);
			printDoctorList();
			break;
		default:
			break;
		}
	}

}
