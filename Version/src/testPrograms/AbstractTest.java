package testPrograms;

abstract class AbstractTest {

	public abstract void noOfClassRooms(int noClassRooms);

	String classDept(String dept) {

		return dept;
	}

	void deptHead(String deptHead) {

		System.out.println(deptHead);

	}
}

class A extends AbstractTest {

	public void noOfClassRooms(int noClassRooms) {
		System.out.println("I am in Subclass ClassRooms" + noClassRooms);
		// System.out.println("I am in Subclass Dept");
		super.classDept("");
		super.deptHead("");

	}

}

class B extends A {

	@Override
	public void noOfClassRooms(int noClassRooms) {
		// TODO Auto-generated method stub
		super.noOfClassRooms(noClassRooms);
		super.classDept("");
		super.deptHead("");
	}

}

class Main{
		
	
	public static void main(String args[]) {

		A subclass = new A();
		subclass.noOfClassRooms(10);
		subclass.classDept("Biology");
		subclass.deptHead("Mrs.Dharani");

		B childClass = new B();
		childClass.noOfClassRooms(20);
		childClass.classDept("Physics");
		childClass.deptHead("Mr.Natrajan");
	}

  }