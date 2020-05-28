package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shirtsw  
{
	public static void getShirtSw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..................................................................");
		System.out.println("SHIRTS");
		
		int a=1000;String s="Roadster";
		System.out.println("1. Roadster				Rate=Rs1000");
		
		int a1=1250;String s1="Vero Moda";
		System.out.println("2. Vero Moda			Rate=Rs1250");
		
		int a2=1500;String s2="MANGO";
		System.out.println("3. MANGO				Rate=Rs1500");
		
		int a3=800;String s3="DressBerry";
		System.out.println("4. DressBerry			Rate=Rs800");
		
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
				getShirtSw();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getShirtSw();
		}
	}
}
