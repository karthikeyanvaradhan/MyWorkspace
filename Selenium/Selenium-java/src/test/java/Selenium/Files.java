package Selenium;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) throws IOException {
		/*
		 * Scanner scan = new Scanner(System.in); //
		 * System.out.println("Ënter the Integer"); // int i = scan.nextInt();
		 * // // System.out.println("Ënter the Double"); // double d =
		 * scan.nextDouble(); // // System.out.println("Ënter the String");
		 * 
		 * BufferedReader reader = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = reader.readLine();
		 * 
		 * 
		 * String s =scan.nextLine();
		 * 
		 * 
		 * System.out.println("String: " + s); // System.out.println("Double: "
		 * + d); // System.out.println("Int: " + i);
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ënter the Int");
		int i = scan.nextInt();
		
		scan.nextLine();

		System.out.println("Ënter the String");
		String s = scan.nextLine();


		/*System.out.println("Ënter the Double");
		double d = scan.nextDouble();*/

		System.out.println("Int: " + i);
		/*System.out.println("Double: " + d);*/
		System.out.println("String: " + s);

	}
}
