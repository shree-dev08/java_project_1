package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tshirts
{
	public static void getTshirt()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..................................................................");
		System.out.println("T SHIRTS");

		int a=900;String s="Puma";
		System.out.println("1. Puma				Rate=Rs900");

		int a1=850;String s1="U.S.polo";
		System.out.println("2. U.S.polo			Rate=Rs850");

		int a2=840;String s2=" PeterEnglend";
		System.out.println("3. PeterEnglend		        Rate=Rs840");

		int a3=860;String s3="Adidas";
		System.out.println("4. Adidas			Rate=Rs860");

		int a4=950;String s4="Lacoste";
		System.out.println("5. Lacoste			Rate=Rs950");

		int a5=908;String s5="Gucci";
		System.out.println("6. Gucci			Rate=Rs908");

		System.out.println("7. Previouspage");
		System.out.println("8. Home Page");
		System.out.println("9. Exit");
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
			Carts.addCart(a4,s4);
			break;
		case 6:
			Carts.addCart(a5,s5);
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
				getTshirt();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getTshirt();
		}
	}
}
