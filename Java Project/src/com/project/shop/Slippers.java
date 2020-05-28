package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Slippers
{
		public static void getSlippers()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("FOOT WEAR'S");
			
			int a=900;String s="Puma";
			System.out.println("1. Puma				Rate=Rs900");
			
			int a1=700;String s1="Nike";
			System.out.println("2. Nike				Rate=Rs700");
			
			int a2=800;String s2="Sparx";
			System.out.println("3. Sparx			Rate=Rs800");
			
			System.out.println("4. Previous Page");
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
				FootWears.getFootWears();
				break;
			case 5:
				Category.getHomepage();
				break;
			case 6:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getSlippers();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getSlippers();
			}
		}
	}
