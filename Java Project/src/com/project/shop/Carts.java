package com.project.shop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Carts {
	static ArrayList b = new ArrayList();

	public static void addCart(int a, String s) {
		int Qty = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Quantity");
		System.out.println();
		Qty = sc.nextInt();
		System.out.println("are you sure want to add" + " " + Qty + " " + "items to cart");
		System.out.println("Do you want to continue? Y/N");
		char choice = sc.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			System.out.println("\n");
			System.out.println(Qty + " Item Added to Cart");
		} else if (choice == 'N' || choice == 'n') {
			Category.getHomepage();
		} else {
			System.out.println("\n\n");
			System.out.println("Enter the valid input");
			System.out.println();
			viewCart();
		}

		System.out.println();
		b.add(s);
		b.add(Qty);
		b.add(a);
		Category.getHomepage();
	}

	public static void ext() {
		if (b.size() == 0) {
			System.out.println("\n");
			System.out.println("\n                    No item is purchesed to bill");
			System.out.println("                          purches something.!");
		}
		System.out.println("\n\n\n\n\n\n");
		if (b.size() > 0) {
			int total = 0;
			int Qty = 0;
			System.out.println("				***********    Shopping Bill   ************");
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			Date date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat(
					"E dd.MM.YYYY '                                             ' hh:mm:ss a zzz");
			System.out.println(ft.format(date));
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%-8s %-40s %-8s %-8s %-9s\n", "SI.No", "Item", "Cost", "Qty", "\tTotal");
			System.out.println();
			int j = 1;
			for (int i = 0; i < b.size(); i++) {
				int t1 = (int) b.get(i + 1);
				int t2 = (int) b.get(i + 2);

				total += (t1 * t2);
				Qty += t1;
				System.out.println(j);
				System.out.println(b.get(i));
				System.out.println(b.get(i+2));
				System.out.println(b.get(i+1));
				System.out.printf("%-8s %-40s %-8s %-8s\t %-8s\n", (j), b.get(i), b.get(i + 2), b.get(i + 1),
						(t1 * t2));
				i++;
				i++;
				j++;
			}
			float cgst = total * (9 / 100f);
			float sgst = total * (9 / 100f);
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.printf("%s %-47s %s", "Total Qty:", "", Qty);
			System.out.println();
			System.out.printf("%s %-61s %s", "Sub Total:", "", total);
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-57s %s", "CGST 	  @9%:", "\t", cgst);
			System.out.println();
			System.out.printf("%s %-57s %s", "SGST 	  @9%:", "\t", sgst);
			System.out.println();
			System.out.printf("%s %-56s  %s", "Total GST@18%:", "\t", cgst + sgst);
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-53s  \t%s", " Grand Total:", "", (float) (total + sgst + cgst) + " " + "Rs");
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("                                  Thank you for visiting *SHOPPINGADDA*");
			System.out.println("                                 		Have a Nice Day !");
			System.out.println("                                    		  Visit again....");
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		} else {
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println("         *****          Thak You , Visit Again        *****");
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		}

	}

	public static void viewCart() {
		Scanner sc = new Scanner(System.in);
		if (b.size() > 0) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.printf("%-8s| %-40s |%-8s |%-8s  |%-8s\n", "SI.No", "Item", "Cost Rs", "Qty", "Total");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			int j = 1;
			for (int i = 0; i < b.size(); i++) {
				int t1 = (int) b.get(i + 1);
				int t2 = (int) b.get(i + 2);

				System.out.printf("%-8s| %-40s |%-8s |%-8s  |%-8s\n", (j), b.get(i), b.get(i + 2), b.get(i + 1),
						(t1 * t2));
				i++;
				i++;
				j++;
			}
			System.out.println();
			System.out.println("Do you want to remove from Cart? Y/N");
			char choice = sc.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.println("\n");
				removeCart();
			} else if (choice == 'N' || choice == 'n') {
				Category.getHomepage();
			} else {
				System.out.println("\n\n");
				System.out.println("Enter the valid input");
				System.out.println();
				viewCart();
			}
		} else {
			System.out.println("0 item in the Cart");
			System.out.println();
			System.out.println(" your cart is empty..! please add something to Cart.");
			System.out.println("---------------------------------------------------------------------------");
			Empty.getEmpty();
		}
		System.out.println("\n");
	}

	public static void removeCart() {
		if (b.size() == 0) {
			System.out.println(" yor cart is empty.! add something to cart..");
			System.out.println("--------------------------------------------------------------------");
			Empty.getEmpty();
			return;
		}
		int count = b.size() / 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SI.No of item to be removed");
		try {
			int choice = sc.nextInt();
			if (choice <= count && choice > 0) {
				choice = (choice - 1) * 3;
				b.remove(choice);
				b.remove(choice);
				b.remove(choice);
				System.out.println("Successfully removed");
				Category.getHomepage();
			} else {
				System.out.println("\n");
				System.out.println("Enter a valid input");
				System.out.println();
				System.out.println("Do you want to go Home page OR Remove items Y/N");
				char choice2 = sc.next().charAt(0);
				if (choice2 == 'Y' || choice2 == 'y') {
					System.out.println("\n");
					Category.getHomepage();
				} else if (choice2 == 'N' || choice2 == 'n') {
					removeCart();
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter a valid input");
			System.out.println();
			removeCart();
		}
	}
}
