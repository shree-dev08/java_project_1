package com.project.shop;

import java.util.Scanner;

class Home{
	void welcomeMessage()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yor name");
		String name = scan.nextLine();
		System.out.println("******************************************************************************");
		System.out.println("*************************Welcome "+name+"***************************");
	}
}
public class Homepage {
	public static void main(String args[])
	{
		Home h = new Home();
		h.welcomeMessage();
		Category.getHomepage();
	}
}
