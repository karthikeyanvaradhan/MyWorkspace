package myProjectWorks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest {

	public void arrayList() {

		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> info = new ArrayList<String>();

		name.add("Raj");
		name.add("Mukesh");
		name.add("Derrick");
		//name.remove(0);
		int sizeArray = name.size();		
		System.out.println(sizeArray);
		Collections.sort(name);
		
		System.out.println(name);

		info.add("RajeshKumar");
		info.add("Hebry");
		info.add("5as");

		for (String data : info) {

			System.out.println(data);

		}

	}

	public static void main(String[] args) {

		CollectionTest cl = new CollectionTest();
		cl.arrayList();

	}

}
