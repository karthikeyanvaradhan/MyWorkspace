package javaPractise;

import java.io.InputStream;
import java.util.Scanner;

public class Swapno {

	public void swapno() {

		Scanner scNo = new Scanner(System.in);

		System.out.println("Enter the value of X:"+"\n");
		int x = scNo.nextInt();
		

		System.out.println("Enter the value of Y:"+"\n");
		int y = scNo.nextInt();
		System.out.println("Before Swap the value of X:" + " " + x);
		System.out.println("Before Swap the value of Y:" + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swap the value of X:" + x);
		System.out.println("After Swap the value of Y:" + y);

	}

	public static void main(String[] args) {

		Swapno swap = new Swapno();
		swap.swapno();

	}

}
