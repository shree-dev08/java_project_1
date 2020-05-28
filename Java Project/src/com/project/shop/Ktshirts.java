package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ktshirts 
{
		public static void getKtshirt()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("T shirts");
			
			int a=200; String s="PalmTree";
			System.out.println("1. PalmTree			Rate=Rs200");
			
			int a1=250; String s1="Tantra";
			System.out.println("2. Tantra			Rate=Rs250");
			
			System.out.println("3. Previous page");
			System.out.println("4. Home Page");
			System.out.println("5. Exit");
			int choice=sc.nextInt();
			System.out.println("Select choice:");
			try {
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
				getKtshirt();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getKtshirt();
			}
		}
	}
