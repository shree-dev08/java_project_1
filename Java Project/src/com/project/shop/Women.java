package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Women 
{
	public static void getWomen()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*************************************************************");
		System.out.println("WOMEN'S");
		System.out.println("1. Tshirts");
		System.out.println("2. Shirts");
		System.out.println("3. Pants");
		System.out.println("4. Ethnic Wear");
		System.out.println("5. Previous page");
		System.out.println("6. Home Page");
		System.out.println("7. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Tshirtsw.getTshirtw();
			break;
		case 2:
			Shirtsw.getShirtSw();
			break;
		case 3:
			Pantsw.getPantsw();
			break;
		case 4:
			EthnicWear.getEthnicWear();
			break;
		case 5:
			Clothes.getCloths();
			break;
		case 6:
			Category.getHomepage();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("chioce give option... try again!");
			getWomen();
			break;
	}
}
	catch(InputMismatchException e) {
		System.out.println("enter the correct choice");
		getWomen();
		}
	}
}
