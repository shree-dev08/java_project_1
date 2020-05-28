package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Novels
{

	public static void getNovels()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("....................................................");
		System.out.println("NOVELS");
		  
		int a=250;String s= "Think and Grow Rich";
		System.out.println("1. Think and Grow Rich     Rate=Rs250");
		
		int a1=230;String s1= "Half Girlfriend";
		System.out.println("2. Half Girlfriend         Rate=Rs230");
		
		int a2=200;String s2= "First Love ";
		System.out.println("3. First Love              Rate=Rs200");
		
		int a3=2150;String s3= "Wasted in Engineering";
		System.out.println("4. Wasted in Engineering   Rate=Rs150");
		
		System.out.println("5. Previous Page");
		System.out.println("6. Home Page");
		System.out.println("7. Exit");
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
			Books.getBooks();
			break;
		case 6:
			Category.getHomepage();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			 getNovels();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		 getNovels();
		}
	}
}
