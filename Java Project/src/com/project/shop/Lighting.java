package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lighting
{

	public static void getLighting()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("...........................................................");
		System.out.println("LIGHTING");
		
		int a=500;String s=" Xergy Bolt";
		System.out.println("1. Xergy Bolt			Rate=Rs500");
		
		int a1=420;String s1="Ltettes Beaut";
		System.out.println("2. Ltettes Beauty		Rate=Rs420");
		
		int a2=350;String s2=" Quace Plastic";
		System.out.println("3. Quace Plastic		Rate=Rs350");
		
		int a3=800;String s3=" Satyam Kraft";
		System.out.println("4. Satyam Kraft			Rate=Rs800");
		
		int a4=999;String s4= " Glimmer";
		System.out.println("5. Glimmer				Rate=Rs999");
		
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
			getLighting();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getLighting();
		}
	}
}
