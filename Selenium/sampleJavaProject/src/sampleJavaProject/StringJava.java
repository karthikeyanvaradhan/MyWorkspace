package sampleJavaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringJava {
	
	public StringJava(){
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Ënter the Text");
		String text = sc.nextLine();
		int stlength = text.length();
		System.out.println(stlength);
		
		String reverse = "";
		
		for (int i=text.length()-1; i >= 0;i--){
			
			reverse = reverse + text.charAt(i);
		
		}
		
		System.out.println("The Reverse String");
		System.out.println(reverse);
		
	}
	
	public static void main (String args[]){
		
		StringJava stjava = new StringJava();
	}


	}
	
