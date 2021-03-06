package com.test.programs.AbstractionTest;

public class AccessSpecifiers {

	public int a = 1;
	String name = "Karthikeyan";
	protected String child = "Aashish";
	private int age = 22;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String args[]) {

		ValidateAccessSpecifiers ac = new ValidateAccessSpecifiers();
		ac.ageDisplay();
		ac.nameDisplay();

	}
}

class ValidateAccessSpecifiers extends AccessSpecifiers {

	public int ageDisplay() {
		System.out.println(getAge());
		setAge(33);
		System.out.println("setAge"+getAge());
		return getAge();
	}

	public String nameDisplay() {
		System.out.println(child);
		return child;

	}

}