package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cannon
{
	public static void getcanon()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("CANON");

		int a=12741;String s=" canon EOS 300D ";
		System.out.println("1. canon EOS 300D       		Rate=Rs12741");

		int a1=27000;String s1="canon EOS 500D";
		System.out.println("2. canon EOS 500D	   			Rate=Rs27000");

		int a2=32000;String s2="canon EOS 650D";
		System.out.println("3. canon EOS 650D      			Rate=Rs32000");

		int a3=18000;String s3="canon EOS 1000D ";
		System.out.println("4. canon EOS 1000D       		Rate=Rs18000");


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
				System.out.println("chioce give option... try again!");
				getcanon();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getcanon();
		}
	}
}
