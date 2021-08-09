package com.first_java.controller;

import java.util.Scanner;

public class FacebookController {
	
	public void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no ");
		int i1 = sc.nextInt();

		System.out.println("enter second no ");
		int i2 = sc.nextInt();

		System.out.println("Addition is " + (i1 + i2));
	}

	public static void addition(int i, int j) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no ");
		int i1 = sc.nextInt();

		System.out.println("enter second no ");
		int i2 = sc.nextInt();

		System.out.println("Addition is " + (i1 + i2));
	}

	public void createProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name ");
		String name = sc.next();

		System.out.println("enter password ");
		String password = sc.next();

		System.out.println("enter email ");
		String email = sc.next();

		System.out.println("enter address ");
		String address = sc.next();

		System.out.println("your details are " + name + "  " + password + "   " + email + "  " + address);
		System.out.println("registration success");
	}

	public void viewProfile() {

	}

	public void editProfile() {

	}

	public void deleteProfile() {

	}

	public void searchProfile() {

	}


}
