package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empty
{
	public static void getEmpty() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to exit?");
		System.out.println("1. Home page");
		System.out.println("2. Exit ");
		try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Category.getHomepage();
				break;
			case 2:
				System.out.println("\n\n");
				System.out.println("_____________________________________________________");
				System.out.println("	    ***THANK YOU VISIT AGAIN***");
				System.out.println("_____________________________________________________");
				break;
			case 9:
				Exit.getExit();
				break;
			default:

				System.out.println("chioce give option... try again!");
				getEmpty();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getEmpty();
		}
	}
}
