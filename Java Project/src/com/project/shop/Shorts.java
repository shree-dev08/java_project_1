package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shorts
{
	public static void getShorts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(".....................................................................");
		System.out.println("SHORTS");
		
		int a=900;String s=" Nike";
		System.out.println("1. Nike				Rate=Rs900");
		
		int a1=850;String s1=" USPA";
		System.out.println("2. USPA				Rate=Rs850");
		
		int a2=650;String s2=" Baby Hug";
		System.out.println("3. Baby Hug			Rate=Rs650");
		
		int a3=875;String s3=" Zero";
		System.out.println("4. Zero				Rate=Rs875");
		
		int a4=985;String s4=" Baby oye";
		System.out.println("5. Baby oye			Rate=Rs985");
		
		int a5=1000;String s5=" INDIAN";
		System.out.println("6. INDIAN			Rate=Rs1000");
		
		System.out.println("7. Previouspage");
		System.out.println("8. Home Page");
		System.out.println("9. Exit");
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
			Carts.addCart(a5,s5);
			break;
		case 7:
			Men.getMens();
			break;
		case 8:
			Category.getHomepage();
			break;
		case 10:
		Exit.getExit();
		break;
		default:
			System.out.println("chioce give option... try again!");
			getShorts();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getShorts();
		}
	}
}


