package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pants
{
	public static void getPants()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("............................................................................");
	System.out.println("PANTS");
	
	int a=3000; String s="Flying Machine";
	System.out.println("1. Flying Machine		Rate=Rs 3000");
	
	int a1=2000; String s1="Cherokee";
	System.out.println("2. Cherokee				Rate=Rs 2000");
	
	int a2=1500; String s2="Pepe Jeans";
	System.out.println("3. Pepe Jeans			Rate=Rs 1500");
	
	int a3=1800; String s3="Gini & Jony";
	System.out.println("4. Gini & Jony			Rate=Rs 1800");
	
	int a4=2100; String s4="Spykar";
	System.out.println("5. Spykar				Rate=Rs 2100");
	
	int a5=900; String s5="Wrangler";
	System.out.println("6. Wrangler				 Rate=Rs 900");
	
	System.out.println("7. Previouspage");
	System.out.println("8. Home Page");
	System.out.println("9. Exit");
	System.out.println("Select choice:");
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
		Carts.addCart(a4, s4);
		break;
	case 6:
		Carts.addCart(a5, s5);
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
		getPants();
		break;
}
}
catch(InputMismatchException e) {
	System.out.println("enter the correct choice");
	getPants();
	}
}

	}

