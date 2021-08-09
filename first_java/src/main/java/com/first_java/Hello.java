package com.first_java;

import com.first_java.controller.FacebookController;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		FacebookController h=new FacebookController();
		
		System.out.println("***********************MAIN MENU**********************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 for addition");
		System.out.println("press 7 for addition with parameter or overloaded function");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1: h.createProfile();
			break;
		case 2: h.viewProfile();
			break;
		case 3: h.editProfile();
			break;
		case 4:h.deleteProfile();
			break;
		case 5:h.searchProfile();
			break;
		case 6:h.addition();
			break;
		case 7: FacebookController.addition(6,7);
			break;
			default :System.out.println("wrong choice");
		}
		
		
	}

	
}
