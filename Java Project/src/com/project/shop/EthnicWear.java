package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EthnicWear  
{
	public static void getEthnicWear()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..................................................................");
		System.out.println("T SHIRTS");
		
		int a=2500;String s="Saree";
		System.out.println("1. Saree                 Rate=Rs2500");
		
		int a1=800;String s1="Salwar Kameez";
		System.out.println("2. Salwar Kameez         Rate=Rs800");
		
		int a2=900;String s2="Patiala Suits";
		System.out.println("3. Patiala Suits         Rate=Rs900");
		
		int a3=1500;String s3="Kurta";
		System.out.println("4. Kurta                 Rate=Rs1500");
		
		int a4=1200;String s4="Dupattas";
		System.out.println("5. Dupattas				 Rate=Rs1200");
		
		int a5=600;String s5="Long Skirt ";
		System.out.println("6. Long Skirt            Rate=Rs600");
		
		System.out.println("7. Previouspage");
		System.out.println("8. Home Page");
		System.out.println("9. Exit");
		System.out.println("select choice:");
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
			Women.getWomen();
			break;
		case 8:
			Category.getHomepage();
			break;
		case 9:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getEthnicWear();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getEthnicWear();
		}
	}
}
