package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Furniture
{

	public static void getFurniture()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..............................................................");
		System.out.println("FURNITURES");
		
		int a=5000;String s=" Sofas";
		System.out.println("1. Sofas					Rate=Rs5000");
		
		int a1=3000;String s1="  Dining Sets";
		System.out.println("2. Dining Sets				Rate=Rs3000");
		
		int a2=1300;String s2=" Swing Chairs";
		System.out.println("3. Swing Chairs				Rate=Rs1300");
		
		int a3=1200;String s3=" Beds	";
		System.out.println("4. Beds						Rate=Rs1200");
		
		int a4=900;String s4=" Study Tables	";
		System.out.println("5. Study Tables				Rate=Rs900");
		
		System.out.println("6. Previous Page");
		System.out.println("7. Home Page");
		System.out.println("8. Exit");
		System.out.println("Select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Carts.addCart(a,s);
			break;
		case 2:
			Carts.addCart(a1,s1);
			break;
		case 3:
			Carts.addCart(a2,s2);
			break;
		case 4:
			Carts.addCart(a3,s3);
			break;
		case 5:
			Carts.addCart(a4,s4);
			break;
		case 6:
			HomeApplications.getHomeApplications();
			break;
		case 7:
			Category.getHomepage();
			break;
		case 8:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getFurniture();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getFurniture();
		}
	}
}
