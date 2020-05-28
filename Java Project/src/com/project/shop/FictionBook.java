package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FictionBook
{

	public static void getFictionBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("......................................................................");
		System.out.println("FICTION BOOKS");
		
		int a=230;String s=" Heads You Win";
		System.out.println("1. Heads You Win					Rate=Rs230");
		
		int a1=100;String s1="Everyone Has A Story";
		System.out.println("2. Everyone Has A Story				Rate=Rs100");
		
		int a2=300;String s2="The Monk Who Sold His Ferrari";
		System.out.println("3. The Monk Who Sold His Ferrari	Rate=Rs300");
		
		System.out.println("4. Previous Page");
		System.out.println("5. Home Page");
		System.out.println("6. Exit");
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
			Books.getBooks();
			break;
		case 5:
			Category.getHomepage();
			break;
		case 6:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getFictionBook();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getFictionBook();
		}
	}
}
