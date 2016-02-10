package com.training.tr;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
     System.out.println("Enter Username=");
     String name = sc.nextLine();
     System.out.println("Enter Password=");
     String password = sc.nextLine();
     User obj = new User(name, password);
     ValidateUser obj1= new ValidateUser();
     System.out.println(obj1.Validate(obj));
     sc.close();
	}

}
