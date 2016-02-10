package com.training.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {
	
	private HashMap<String, ArrayList<String>> booklist;
	public HashMaps(){
		booklist = new HashMap<String, ArrayList<String>>();
		init();
	}
	public void init(){
		ArrayList<String> sub = new ArrayList<String>();
		sub.add("algo");
		sub.add("compiler");
		sub.add("automata");
		booklist.put("CS",sub);
		ArrayList<String> sub1 = new ArrayList<String>();
		sub1.add("optics");
		sub1.add("quantum mechanics");
		sub1.add("laser");
		booklist.put("physics",sub1);
		
	}
	public ArrayList<String> show(){
		return booklist.get("physics");
	}

}
