package com.test.programs.AbstractionTest;

public class ThisClass {

	ThisClass() {

		System.out.println("This Class Contructor without Parameters");
	}

	public void ThisClass() {

		System.out.println("Jio");

	}

	ThisClass(int a) {

		this();

		System.out.println("sys output" + a);

	}

	public static void main(String[] args) {

		ThisClass thclass = new ThisClass(5);

	}

}
