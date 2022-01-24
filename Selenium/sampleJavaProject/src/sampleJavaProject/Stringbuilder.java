package sampleJavaProject;

import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Stringbuilder {

	public static void stringBuilder() {

		Scanner sc = new Scanner(System.in);

		String inp = sc.nextLine();

		StringBuffer strbf = new StringBuffer(inp);

		for (int i = inp.length() - 1; i > 0; i--) {

			strbf.append(inp.charAt(i));
		}
		
		System.out.println(strbf.toString());
	
	}
	
	public static void main(String args[]){
		
		Stringbuilder stb = new Stringbuilder();
		stb.stringBuilder();
		
	}

}