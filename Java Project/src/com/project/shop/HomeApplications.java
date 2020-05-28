package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeApplications 
{
	
	enum HomeApplicationItems 
    { 
         KITCHEN,FURNITURE,LIGHTING;
    } 
	
	public static void getHomeApplications()
	{
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		for (HomeApplicationItems homeApplicationItem  : HomeApplicationItems.values()) {
			System.out.println(String.format("%d. %s", i++,homeApplicationItem));
		}
		
		
		
		System.out.println(".......................................................");
		System.out.println("HOME APPLICATION");
		System.out.println("1. Kitchen");
		System.out.println("2. Furniture");
		System.out.println("3. Lighting");
		System.out.println("4. Home Page");
		System.out.println("5. Exit");
		System.out.println("Select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Kitchen.getKitchen();
			break;
		case 2:
			Furniture.getFurniture();
			break;
		case 3:
			Lighting.getLighting();
			break;
		case 4:
			Category.getHomepage();
			break;
		case 5:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			 getHomeApplications();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		 getHomeApplications();
		}
	}
}
