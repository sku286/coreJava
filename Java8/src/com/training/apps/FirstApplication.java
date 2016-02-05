package com.training.apps;

import java.util.ArrayList;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {
		
		Greeting grt = ()->{return 8+9;};
		System.out.println(grt.show());
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("ram");
		arr.add("shyam");
		arr.forEach(System.out::println);

	}

}
