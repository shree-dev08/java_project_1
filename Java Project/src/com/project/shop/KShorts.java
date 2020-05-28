package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KShorts
{
		public static void getKShorts()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("SHORTS ANR PANTS");
			
			int a=430;String s="BabyHug";
			System.out.println("1. BabyHug        Rate=Rs430");
			
			int a1=600;String s1="Tango";
			System.out.println("2. Tango          Rate=Rs600");
			
			System.out.println("3. Previous page");
			System.out.println("4. Home Page");
			System.out.println("5. Exit");
			System.out.println("Select choice:");
			try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				 Carts.addCart(a, s);
				break;
			case 2:
				Carts.addCart(a1, s1);
				break;
			case 3:
				Kids.getKids();
				break;
			case 4:
				Category.getHomepage();
				break;
			case 5:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getKShorts();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getKShorts();
			}
		}
	}
