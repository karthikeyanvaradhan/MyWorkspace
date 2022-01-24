package com.java.practice.programs;


public class LinkedClassDemo {

	public void parentMethod() {

		System.out.println("I am in Parent Class");
	}

}	
	class Child extends LinkedClassDemo {

		public void parentMethod() {

			System.out.println("I am in Child Class");
		}


	
	public static void main(String[] args) {

		LinkedClassDemo demo = new Child();
		demo.parentMethod();
		
	}	
}