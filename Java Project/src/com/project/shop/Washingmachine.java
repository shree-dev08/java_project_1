package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Washingmachine
{
	public static void getWashingmachin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("WASHING MACHIN");
		
		int a=45000;String s=" LG";
		System.out.println("1. LG					Rate=Rs45000");
		
		int a1=35000;String s1="Samsung";
		System.out.println("2. Samsung				Rate=Rs35000");
		
		int a2=30000;String s2="Onida";
		System.out.println("3. Onida				Rate=Rs30000");
		
		System.out.println("4. Previous Page");
		System.out.println("5. Home Page");
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
			Electronics.getElectronics();
			break;
		case 5:
			Category.getHomepage();
			break;
		case 6:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getWashingmachin();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getWashingmachin();
		}

	}
}
