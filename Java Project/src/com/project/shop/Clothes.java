package com.project.shop;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clothes 
{	
	public static void getCloths()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********************************************************************");
		System.out.println("CLOTHES");
		System.out.println("1. Men's");
		System.out.println("2. Women's");
		System.out.println("3. Kid's");
		System.out.println("4. Home page");
		System.out.println("5. Exit");
		System.out.println("select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Men.getMens();
			break;
		case 2:
			Women.getWomen();
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
			getCloths();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getCloths();
		}
	}
}