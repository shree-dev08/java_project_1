package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Television
{	
	public static void getTelivision()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("TELIVISION");
		
		int a=150000;String s="Sony";
		System.out.println("1. Sony				Rate=Rs150000");
		
		int a1=100000;String s1="Samsung";
		System.out.println("2. Samsung			Rate=Rs100000");
		
		int a2=85000;String s2="Onida";
		System.out.println("3. Onida			Rate=Rs85000");
		
		int a3=50000;String s3="LG";
		System.out.println("4. LG				Rate=Rs50000");
		
		System.out.println("5. Previous Page");
		System.out.println("6. Home Page");
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
			Electronics.getElectronics();
			break;
		case 6:
			Category.getHomepage();
			break;
		case 9:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getTelivision();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getTelivision();
		}
	}
}
