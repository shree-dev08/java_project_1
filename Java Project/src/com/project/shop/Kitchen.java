package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kitchen
{
	
	public static void getKitchen()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("KITCHEN");
		
		int a=2300;String s=" Gas Stoves";
		System.out.println("1. Gas Stoves			Rate=Rs2300");
		
		int a1=900;String s1=" Cookware Sets";
		System.out.println("2. Cookware Sets		Rate=Rs900");
		
		int a2=500;String s2=" Glasses";
		System.out.println("3. Glasses				Rate=Rs500");
		
		int a3=230;String s3=" Water Bottles";
		System.out.println("4. Water Bottles		Rate=Rs230");
		
		System.out.println("5. Previous Page");
		System.out.println("6. Home Page");
		System.out.println("7. Exit");
		System.out.println("Select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Carts.addCart(a, s);
			break;
		case 2:
			Carts.addCart(a1, s1);
			break;
		case 3:
			Carts.addCart(a2, s2);
			break;
		case 4:
			Carts.addCart(a3, s3);
			break;
		case 5:
			HomeApplications.getHomeApplications();
			break;
		case 6:
			Category.getHomepage();
			break;
		case 7:
			Exit.getExit();
		default:
			System.out.println("chioce give option... try again!");
			getKitchen();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getKitchen();
		}
	}
}
