package ceiTrainingClass;

import org.testng.annotations.Test;

@Test
abstract class AbstractClass {

	String name;
	String color;
	String gender;
	int age;

	AbstractClass(String name, String color, char mf, int age) {

		this.name = name;
		this.color = color;
		this.age = age;
		this.gender = (mf == 'M') ? "Male" : "Female";
	}

	abstract String getBread();

	void printInfo() {

		System.out.println(name + " is " + ((age % 10 == 8) ? "an " : "a ") + age + " year old " + gender +" "+getBread()
				+ " with a " + color + " coat.");
	}

	
	public static void main(String[] args) {

		AbstractClass subClass1 = new KleeKai("Lilly", "Brown", 'M', 18);
		AbstractClass subClass2 = new SiberianHusky("Rosie", "White", 'N', 7);

		subClass1.printInfo();
		subClass2.printInfo();

	}
	
}

class KleeKai extends AbstractClass {

	KleeKai(String name, String color, char mf, int age) {
		super(name, color, mf, age);

	}

	String getBread() {
		// TODO Auto-generated method stub
		return "Klee Kai";

	}

}

class SiberianHusky extends AbstractClass {

	SiberianHusky(String name, String color, char mf, int age) {
		super(name, color, mf, age);
		// TODO Auto-generated constructor stub
	}

	String getBread() {
		// TODO Auto-generated method stub
		return "SiberianHusky";

	}
	
}