package com.training.maps;

import java.util.ArrayList;
import java.util.Iterator;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMaps obj = new HashMaps();
		ArrayList<String> find= obj.show();
		//System.out.println(find);
		Iterator<String> itr = find.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
