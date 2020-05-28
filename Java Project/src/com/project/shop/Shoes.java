package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shoes
{
		public static void getShoes()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("FOOT WEAR'S");
			
			int a=4000;String s=" Puma";
			System.out.println("1. Puma					Rate=Rs4000");
			
			int a1=3000;String s1="Nike";
			System.out.println("2. Nike					Rate=Rs3000");
			
			int a2=2500;String s2="Sparx";
			System.out.println("3. Sparx				Rate=Rs2500");
			
			int a3=3500;String s3="Adidas";
			System.out.println("4. Adidas				Rate=Rs3500");
			
			System.out.println("5. Previous Page");
			System.out.println("6. Home Page");
			System.out.println("7. Exit");
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
				FootWears.getFootWears();
				break;
			case 6:
				Category.getHomepage();
				break;
			case 7:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getShoes();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getShoes();
			}
		}
	}
