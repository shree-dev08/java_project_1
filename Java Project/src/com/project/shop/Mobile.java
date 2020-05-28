package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mobile
{	
	public static void getMobile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("MOBILES");
		
		int a=60000;String s=" Apple";
		System.out.println("1. Apple				Rate=Rs 60000");
		
		int a1=45000;String s1=" Samsung";
		System.out.println("2. Samsung				Rate=Rs 45000");
		
		int a2=43000;String s2="Nokia";
		System.out.println("3. Nokia				Rate=Rs 43000");
		
		int a3=25000;String s3=" Moto";
		System.out.println("4. Moto					Rate=Rs 25000");
		
		int a4=10000;String s4=" Lenovo";
		System.out.println("5. Lenovo				Rate=Rs 10000");
		
		int a5=35000;String s5=" Sony";
		System.out.println("6. Sony  				Rate=Rs 35000");
		
		System.out.println("7. Previous Page");
		System.out.println("8. Home Page");
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
			Electronics.getElectronics();
			break;
		case 8:
			Category.getHomepage();
			break;
		case 9:
			Exit.getExit();
			break;
		default:
			System.out.println("choice give option... try again!");
			getMobile();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getMobile();
		}
	}
}
