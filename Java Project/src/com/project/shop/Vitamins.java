package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vitamins
{

	public static void getVitamins()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("...................................................");
		System.out.println("VITAMINS");
		
		int a=2500;String s="Sports";
		System.out.println("1. Sports					Rate=Rs2500");
		
		int a1=1800;String s1="Family Nutrition";
		System.out.println("2. Family Nutrition			Rate=Rs1800");
		
		int a2=2220;String s2="Ayurveda Nutrition";
		System.out.println("3. Ayurveda Nutrition		Rate=Rs2220");
		
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
				System.out.println("choice give option... try again!");
				getVitamins();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getVitamins();
		}
	}
}
