package javaCollectionInterfaces;

import java.util.*;

public class ListArrayList {

	// static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {

			List<String> alist = new ArrayList<String>();

			Iterator<String> it = alist.iterator();

			it.hasNext();
			
			System.out.println(i);

		
			
			//System.out.println("After Remove of value 2");

			for (String rval : alist) {

				alist.remove(2);
				System.out.println(rval);

			}

			// for (String indexPointno : alist) {
			// System.out.println("The Index of i:" + indexPointno);

		}

	}
}