package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sony
{
	public static void getsony()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("SONY");

		int a=12621;String s="Sony DSC/H300 ";
		System.out.println("1. Sony DSC/H300        	Rate=Rs12621");

		int a1=25000;String s1="Sony alpha700";
		System.out.println("2. Sony alpha700	   		Rate=Rs25000");

		int a2=30000;String s2="Sony alpha200";
		System.out.println("3. Sony alpha200       		Rate=Rs30000");

		int a3=15000;String s3="Sony DSC W830";
		System.out.println("4.  Sony DSC W830       	Rate=Rs15000");


		System.out.println("5. Previous Page");
		System.out.println("6. Home Page");
		System.out.println("select choice:");
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
				Carts.addCart(a2, s2);
				break;
			case 4:
				Carts.addCart(a3, s3);
				break;
			case 5:
				Camera.getCamera();
				break;
			case 6:
				Category.getHomepage();
				break;
			case 7:
				Exit.getExit();
				break;
			default:
				System.out.println("choice give option... try again!");
				getsony();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getsony();
		}
	}
}
