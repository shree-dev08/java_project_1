package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pantsw  
{
	public static void getPantsw()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("..................................................................");
	System.out.println("PANTS");
	
	int a=1500;String s="Nike";
	System.out.println("1. Nike				Rate=Rs1500");
	
	int a1=1800;String s1="American Eagle";
	System.out.println("2. American Eagle	Rate=Rs1800");
	
	int a2=2000;String s2="Forever 21";
	System.out.println("3. Forever 21		Rate=Rs2000");
	
	int a3=2100;String s3="PacSun";
	System.out.println("4. PacSun			Rate=Rs2100");
	
	System.out.println("5. Previouspage");
	System.out.println("6. Home Page ");
	System.out.println("6. Exit");
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
		Women.getWomen();
		break;
	case 6:
		Category.getHomepage();
	case 8:
		Exit.getExit();
		break;
	default:
		System.out.println("chioce give option... try again!");
		getPantsw();
		break;
}
}
catch(InputMismatchException e) {
	System.out.println("enter the correct choice");
	getPantsw();
	}
}
	}
