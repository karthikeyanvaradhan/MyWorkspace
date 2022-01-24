package com.test.programs.AbstractionTest;
/*package com.test.programs.AbstractionTest;

public class AnimalCharacteristics implements Animal {

	String typeofAnimal = "wild";
	String color = "white";
	String roar = "roar";
	String run = "SpeedRun";

	public void animalType(String animaltype) {

		animaltype = typeofAnimal;
		System.out.println(animaltype);

	}

	public void animalColour(String animalcolor) {

		animalcolor = color;
		System.out.println(animalcolor);
	}

	public void animalRoar(String animalroar) {

		animalroar = roar;
		System.out.println(animalroar);

	}

	public void animalRun(String animalrun) {

		animalrun = run;
		System.out.println(animalrun);
	}

	


public static void main(String[] args) {

	AnimalCharacteristics animalchar = new AnimalCharacteristics();
	
	animalchar.animalColour("Red");
	animalchar.animalRoar("MEW");
	animalchar.animalRun("Runs Fast");
	animalchar.animalType("Carnovorous");

 }
}*/

public class Add{
	
public int add(int a, int b){
	int c=a+b;
	return c;
}

public static void main(String[] args) {

Add a = new Add();
int val = a.add(10, 20);

 }
}