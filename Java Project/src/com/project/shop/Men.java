package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Men 
{
		public static void getMens()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("MEN'S");
			System.out.println("1. Tshirts");
			System.out.println("2. Shirts");
			System.out.println("3. Pants");
			System.out.println("4. Shorts");
			System.out.println("5. Previous page");
			System.out.println("6. Home Page");
			System.out.println("7. Exit");
			System.out.println("Select choice:");
			try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				 Tshirts.getTshirt();
				break;
			case 2:
				Shirts.getShirts();
				break;
			case 3:
				Pants.getPants();
				break;
			case 4:
				Shorts.getShorts();
				break;
			case 5:
				Clothes.getCloths();
				break;
			case 6:
				Category.getHomepage();
				break;
			case 7:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getMens();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getMens();
			}
		}
	}
