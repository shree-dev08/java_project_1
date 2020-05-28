package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Books {
	public static void getBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("******************************************************");
		System.out.println("BOOKS");
		System.out.println("1. Novels");
		System.out.println("2. Fiction Book");
		System.out.println("3. EBooks");
		System.out.println("4. Home Page");
		System.out.println("5. Exit");
		System.out.println("select choice:");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Novels.getNovels();
				break;
			case 2:
				FictionBook.getFictionBook();
				break;
			case 3:
				EBooks.getEBooks();
				break;
			case 4:
				Category.getHomepage();
				break;
			case 5:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getBooks();
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("enter the correct choice");
			getBooks();
		}
	}
}
