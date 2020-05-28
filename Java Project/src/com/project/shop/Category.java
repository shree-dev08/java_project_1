package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Category
{
	public static void getHomepage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("              	 *****WELCOME TO HOME PAGE****");
		System.out.println("\n");
		System.out.println("CATEGORIES");
		System.out.println("1. Clothes");
		System.out.println("2. Electronics");
		System.out.println("3. HomeApplication");
		System.out.println("4. Books");
		System.out.println("5. Healths");
		System.out.println("6. FootWears");
		System.out.println("7. View Cart");
		System.out.println("8. Remove Cart");
		System.out.println("9. Exit");
		System.out.println("select choice:");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Clothes.getCloths();
			break;
		case 2:
			Electronics.getElectronics();
			break;
		case 3:
			HomeApplications.getHomeApplications();
			break;
		case 4:
			Books.getBooks();
			break;
		case 5:
			Healths.getHealths();
			break;
		case 6:
			FootWears.getFootWears();
			break;
		case 7:
			Carts.viewCart();
			break;
		case 8:
			Carts.removeCart();
			break;
		case 9:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getHomepage();
			break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("chioce give option... try again!");
			getHomepage();
		}
}
}
