package com.test.programs.AbstractionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionInterfaceTest {

	public void setMethod() {

		Set<String> setIn = new HashSet<>();
		setIn.add("karthik");
		setIn.add("Dhanasekar");
		
		
		/*setIn.forEach(){
			(n)->System.out.println(n);
			
		};*/
		
		
		/*for(String setName : setIn){
			
			System.out.println(setName);
			
		}*/

/* 		Iterator<String> names = setIn.iterator();

		while (names.hasNext()) {

			String printNames = names.next();

			System.out.println(printNames);

		}
*/		
		
	}
	
	public void add(){
		int a=1;
		int b=1;
		int  c=a+b;
		System.out.println(c);
	}

	public static void main(String args[]) {
		
		CollectionInterfaceTest setInvoc = new CollectionInterfaceTest();
		setInvoc.setMethod();
		setInvoc.add();

	}

}
