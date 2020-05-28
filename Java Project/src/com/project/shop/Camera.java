package com.project.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Camera
{
	public static void getCamera()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..........................................................");
		System.out.println("CAMERA");
		System.out.println("1. Sony");		
		System.out.println("2. Nikon");
		System.out.println("3. Cannon");
		System.out.println("4. Previous Page");
		System.out.println("5. Home Page");
		System.out.println("select choice:");
		try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Sony.getsony();
				break;
			case 2:
				Nikon.getnikon();
				break;
			case 3:
				Cannon.getcanon();
				break;
			case 4:
				Electronics.getElectronics();
				break;
			case 5:
				Category.getHomepage();
				break;
			case 6:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getCamera();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getCamera();
		}
	}
}
