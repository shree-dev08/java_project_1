package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kshirts
{
	public static void getKshirts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*************************************************************");
		System.out.println("SHIRTS");
		
		int a=200;String s=" UFO";
		System.out.println("1. UFO					Rate=Rs200");
		
		int a1=250;String s1=" Indian Terrain";
		System.out.println("2. Indian Terrain		Rate=Rs250");
		
		int a2=300;String s2=" Tommy Hilfiger";
		System.out.println("3. Tommy Hilfiger		Rate=Rs300");
		
		System.out.println("4. Previous page");
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
			Kids.getKids();
			break;
		case 5:
			Category.getHomepage();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getKshirts();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getKshirts();
		}
	}
}
