package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shirts
{
	public static void getShirts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("............................................................");
		System.out.println("SHIRTS");

		int a=1000;String s="Louis Philippe";
		System.out.println("1. Louis Philippe		Rate=Rs1000");

		int a1=1500;String s1="John Players";
		System.out.println("2. John Players			Rate=Rs1500");

		int a2=1320;String s2="Levi's";
		System.out.println("3. Levi's				Rate=Rs1320");

		int a3=1540;String s3="Tommy Hilfiger";
		System.out.println("4. Tommy Hilfiger		Rate=Rs1540");

		int a4=2000;String s4="Versace";
		System.out.println("5. Versace				Rate=Rs2000");

		int a5=2540;String s5="Hugo Boss";
		System.out.println("6. Hugo Boss			Rate=Rs2540");

		System.out.println("7. Previouspage");
		System.out.println("8. Home Page");
		System.out.println("9. Exit");
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
				Carts.addCart(a4,s4);
				break;
			case 6:
				Carts.addCart(a5,s5);
				break;
			case 7:
				Men.getMens();
				break;
			case 8:
				Category.getHomepage();
				break;
			case 9:
				Exit.getExit();
				break;
				default:
					System.out.println("chioce give option... try again!");
					getShirts();
					break;
			}
		}
			catch(InputMismatchException e) {
				System.out.println("enter the correct choice");
				getShirts();
			}
		}

	}

