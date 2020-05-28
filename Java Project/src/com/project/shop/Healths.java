package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Healths 
{

	public static void getHealths()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("...............................................................");
		System.out.println("HEALTHS");
		System.out.println("1. Ayurveda");
		System.out.println("2. Vitamins");
		System.out.println("3. SkinCare");
		System.out.println("4. Home Page");
		System.out.println("5. Exit");
		System.out.println("Select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			 Ayurveda.getAyurveda();
			break;
		case 2:
			Vitamins.getVitamins();
			break;
		case 3:
			SkinCare.getSkinCare();
			break;
		case 4:
			Category.getHomepage();
			break;
			case 5:
			Exit.getExit();
			break;
			default:
				System.out.println("chioce give option... try again!");
				 getHealths();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			 getHealths();
		}
	}
}
