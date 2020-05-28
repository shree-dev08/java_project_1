package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SkinCare 
{

	public static void getSkinCare()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("......................................................");
		System.out.println("SKINCARE");
		
		int a=450;String s="Vaseline";
		System.out.println("1. Vaseline			Rate=Rs450");
		
		int a1=280;String s1=" Nivea";
		System.out.println("2. Nivea			Rate=Rs280");
		
		int a2=350;String s2=" Himalaya";
		System.out.println("3. Himalaya			Rate=Rs350");
		
		System.out.println("4.Previous Page");
		System.out.println("5. Home Page");
		System.out.println("6. Exit");
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
			Healths.getHealths();
			break;
		case 5:
			Category.getHomepage();
			break;
			case 6:
			Exit.getExit();
			break; 
			default:
				System.out.println("chioce give option... try again!");
				getSkinCare();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getSkinCare();
		}
	}
}
