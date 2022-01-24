package com.java.oops;



public interface InterfaceTest {
	
	int n=1;
	public static void cal(int n) {
		
		
		System.out.println("value" +n);
	}

class imp implements InterfaceTest{
	
	public static void data(){

		cal(5);
	}

	
	public static void main(String args[]){
		data();
	}
	
	}


}