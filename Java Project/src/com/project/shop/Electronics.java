package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Electronics
{	
	public static void getElectronics()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("Electronics");
		System.out.println("1. Mobile's");
		System.out.println("2. Telivision");
		System.out.println("3. Washing machine");
		System.out.println("4. Laptop's");
		System.out.println("5. Camera's");
		System.out.println("6. Previous Page");
		System.out.println("7. Home Page");
		System.out.println("select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Mobile.getMobile();
			break;
		case 2:
			Television.getTelivision();
			break;
		case 3:
			Washingmachine.getWashingmachin();
			break;
		case 4:
			Laptops.getLaptops();
			break;
		case 5:
			Camera.getCamera();
			break;
		case 6:
			Category.getHomepage();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getElectronics();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getElectronics();
		}
	}
}
