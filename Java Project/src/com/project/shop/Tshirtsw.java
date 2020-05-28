package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tshirtsw  
{
	public static void getTshirtw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..................................................................");
		System.out.println("T SHIRTS");
		
		int a=650;String s="Nautica";
		System.out.println("1. Nautica			Rate=Rs650");
		
		int a1=7000;String s1="Prada";
		System.out.println("2. Prada			Rate=Rs700");
		
		int a2=450;String s2="Hanes";
		System.out.println("3. Hanes			Rate=Rs450");
		
		int a3=500;String s3="DKNY";
		System.out.println("4. DKNY				Rate=Rs500");
		
		System.out.println("5. Previouspage");
		System.out.println("6. Home Page");
		System.out.println("7. Exit");
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
			Women.getWomen();
			break;
		case 6:
			Category.getHomepage();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getTshirtw();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getTshirtw();
		}
	}
}