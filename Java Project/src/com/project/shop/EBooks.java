package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EBooks
{

	public static void getEBooks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("............................................................");
		System.out.println("E-BOOKS");
		
		int a=230;String s="Work Smarter Not Harder";
		System.out.println("1. Work Smarter Not Harder  		Rate=Rs230");
		
		int a1=140;String s1="I Will Teach You Excel";
		System.out.println("2. I Will Teach You Excel			Rate=Rs140");
		
		int a2=300;String s2="Google Adwords";
		System.out.println("3. Google Adwords 					Rate=Rs300");
		
		System.out.println("4. Previous Page");
		System.out.println("5. Home Page");
		System.out.println("6. Exit");
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
			getEBooks();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getEBooks();
		}
	}
}
