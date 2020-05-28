package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Laptops
{
	public static void getLaptops()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("LAPTOPS");
		
		int a=50000; String s="Apple";
		System.out.println("1. Apple				Rate=Rs50000");
		
		int a1=35000; String s1="HP";
		System.out.println("2. HP					Rate=Rs35000");
		
		int a2=38000; String s2="Dell";
		System.out.println("3. Dell					Rate=Rs38000");
		
		int a3=40000; String s3="Lenovo";
		System.out.println("4. Lenovo				Rate=Rs40000");
		
		System.out.println("5. Previous Page");
		System.out.println("6. Home Page");
		System.out.println("Select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Carts.addCart(a, s);;
		case 2:
			Carts.addCart(a1, s1);
			break;
		case 3:
			Carts.addCart(a2, s2);
			break;
		case 4:
			Carts.addCart(a3, s3);
			break;
		case 5:
			Electronics.getElectronics();
			break;
		case 6:
			Category.getHomepage();
			break;
			case 7:
		Exit.getExit();
		break;
			default:
				System.out.println("chioce give option... try again!");
				getLaptops();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getLaptops();
		}
	}
}
