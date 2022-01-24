package com.java.oops;

public class OverRidingClass {

	public void human() {

		System.out.println("Main Human Method");

	}

	public void animal() {

		System.out.println("Main Animal Method");

	}

}

class subClass extends OverRidingClass {

	public void human() {

		System.out.println("SubClass Human Method");

	}

	public void animal() {

		System.out.println("SubClass Animal Method");

	}

	public static void main(String[] args) {

		OverRidingClass obj = new subClass();
		obj.animal();

	}

}	