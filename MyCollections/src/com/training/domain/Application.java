package com.training.domain;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		
		NursingHome obj = new NursingHome();
		Doctor[] obj1 = new Doctor[3];
		obj1[0] = new Doctor(123456,"ram","skin");
		obj1[1] = new Doctor(456789,"shyam","heart");
		obj1[2] = new Doctor(425163,"renu","general");
		
		obj.addDoctor(obj1[0]);
		obj.addDoctor(obj1[1]);
		obj.addDoctor(obj1[2]);
		
		Patient pat1 = new Patient("gulshan",1023,456378965);
		Patient pat2 = new Patient("raja",4529,456389632);
		Patient pat3 = new Patient("raja",4521,456378412);
		
		TreeSet<Patient> patients = new TreeSet<Patient>();
		//Hash set is not ordered on any way -comparable/comparator
		//HashSet<Patient> patients = new HashSet<Patient>();
		patients.add(pat1);
		patients.add(pat2);
		patients.add(pat3);
		
		obj1[0].setPatients(patients);
		/*obj1[1].setPatients(patients);
		obj1[2].setPatients(patients);*/
		
		obj.printDoctorList();
		/*MyComparators obj2 = new MyComparators();
		System.out.println("press \n 1. ID \n 2.Name \n 3.Speciazation");
		int key=0;
		Scanner sc = new Scanner(System.in);
		key=sc.nextInt();
		obj.printSortedList(key);*/
		
		
		

	}

}
