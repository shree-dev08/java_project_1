package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kids
{
		public static void getKids()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("KID'S");
			System.out.println("1. Tshirts");
			System.out.println("2. Shirts");
			System.out.println("3. Shorts&Pants");
			System.out.println("4. Previous page");
			System.out.println("5. Home Page");
			System.out.println("6. Exit");
			System.out.println("Select choice:");
			try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				 Ktshirts.getKtshirt();
				break;
			case 2:
				Kshirts.getKshirts();
				break;
			case 3:
				KShorts.getKShorts();
				break;
			case 4:
				Clothes.getCloths();
				break;
			case 5:
				Category.getHomepage();
				break;
			case 6:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getKids();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getKids();
			}
		}
	}
