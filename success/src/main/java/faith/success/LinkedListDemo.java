package faith.success;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public void parentMethod() {

		System.out.println("I am in Parent Class");
	}

}	
	class Child extends LinkedListDemo {

		public void parentMethod() {

			System.out.println("I am in Child Class");
		}


	
	public static void main(String[] args) {

		LinkedListDemo demo = new Child();
		demo.parentMethod();
		
	}	
}
	/*	LinkedList<String> people = new LinkedList<String>();
		people.add("Ambrose");
		people.add("Sonam");
		people.add("Darshan");

		people.addFirst("Aashish");
		people.add(2, "Akshara");

		people.set(1, "Devi");
		people.add("Akshara");

		int listSize = people.size();

		int[] objPeopleArr = new int[listSize];

		// people.toArray()

		ListIterator<String> iterator = people.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (String name : people) {
			System.out.println(name);
		}

	}

*/