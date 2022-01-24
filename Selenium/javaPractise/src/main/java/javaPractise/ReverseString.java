package javaPractise;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ReverseString {

	public void revString(String textData) throws UnsupportedEncodingException {

	}

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Text Data");

		String rev = "";

		String text = sc.next();

		String original = text.toLowerCase();

		System.out.println("The Original Text" + " " + original);

		int stringLength = original.length();

		System.out.println(stringLength);

		for (int i = stringLength - 1; i >= 0; i--) {

			rev = rev + original.charAt(i);
			//rev.toLowerCase();
			//System.out.println(rev);
		}

		if (original.equals(rev))
		//if (original.equalsIgnoreCase(rev))
			System.out.println(original + " is a palindrome");
		else
			System.out.println(original + " is not a palindrome");

	}

	/*
	 * ReverseString obj = new ReverseString(); obj.revString(text);
	 */
	/*
	 * StringBuilder str = new StringBuilder(); str.reverse();
	 */

}
