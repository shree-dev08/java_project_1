package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nikon
{
	public static void getnikon()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("NIKON");

		int a=12621;String s=" Nikon D810 ";
		System.out.println("1. Nikon D810        	Rate=Rs12621");

		int a1=28000;String s1="Nikon D700";
		System.out.println("2. Nikon D700	   		Rate=Rs28000");

		int a2=32000;String s2="Nikon D3x";
		System.out.println("3. Nikon D3x      		Rate=Rs32000");

		int a3=18000;String s3="Nikon D5 ";
		System.out.println("4.  Nikon D5       		Rate=Rs18000");


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
				getnikon();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getnikon();
		}
	}
}
