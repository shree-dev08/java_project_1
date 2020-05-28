package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ayurveda {

	public static void getAyurveda() {
		Scanner sc = new Scanner(System.in);
		System.out.println("...................................................");
		System.out.println("AURVEDA");

		int a = 45;
		String s = "Soap";
		System.out.println("1. Soap				Rate=Rs45");

		int a1 = 80;
		String s1 = "Facewash";
		System.out.println("2. Facewash			Rate=Rs80");

		int a2 = 35;
		String s2 = "Shampoo";
		System.out.println("3. Shampoo			Rate=Rs35");

		System.out.println("4. Previous Page");
		System.out.println("5. Home Page");
		System.out.println("6. Exit");
		System.out.println("select choice:");
		try {
			int choice = sc.nextInt();
			switch (choice) {
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
				Healths.getHealths();
				break;
			case 5:
				Category.getHomepage();
				break;
			case 6:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getAyurveda();
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println(" enter the correct choice");
			getAyurveda();
		}
	}
}
