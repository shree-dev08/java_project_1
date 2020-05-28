package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FootWears
{
		public static void getFootWears()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("FOOT WEAR'S");
			System.out.println("1. Shoes");
			System.out.println("2. Slippers");
			System.out.println("3. Previous Page");
			System.out.println("4. Home Page");
			System.out.println("5. Exit");
			System.out.println("Select choice:");
			try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Shoes.getShoes();
				break;
			case 2:
				Slippers.getSlippers();
				break;
			case 3:
				FootWears.getFootWears();
				break;
			case 4:
				Category.getHomepage();
				break;
			case 5:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getFootWears();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getFootWears();
			}
		}
	}
