package faith.success;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name"+"\t");
		String input = sc.nextLine();
		System.out.println("The Entered Input String Value is:"+" "+input);
		sc.close();
		
		//String [] temp= new String[input.length()];
		
		int inplen = input.length();
		
		String temp="";
		
		for(int i=inplen-1;i>=0;i--){
		
			temp= temp+input.charAt(i);
		
			
		}
		System.out.println(temp);
	}

}
