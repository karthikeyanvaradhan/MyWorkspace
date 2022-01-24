package javaPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIterator {

	public IteratorListIterator() {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);

		System.out.println("Time to Traverse to ArrayList using Iterator InterFace");
		Iterator<Integer> alIter = al.iterator();
		while (alIter.hasNext()){
			System.out.println(alIter.next() + " ");
			}

		/*
		 * int el = (Integer) alIter.next();
		 * System.out.println("The Iterator value is:" + el);
		 */

		System.out.println();

		System.out.println("Time to Traverse to ArrayList using ListIterator InterFace");

		ListIterator<Integer> alListIter = al.listIterator();

		while (alListIter.hasNext()){
			
		

			System.out.println(alListIter.next() + " ");
		/*
		 * int list_It_Fwd = alListIter.next();
		 * System.out.println("The ListIterator value is:" + list_It_Fwd);
		 */
		/*
		 * while (alListIter.hasPrevious()) { int list_It_Rev =
		 * alListIter.previous(); System.out.println(list_It_Rev);
		 * 
		 */
		}
		
		System.out.println();

		System.out.println("Time to Reverse Traverse to ArrayList using ListIterator InterFace ");
		
		while (alListIter.hasPrevious())
		{
			/*
			 * int prev_int_val = alListIter.previous();
			 * System.out.println("The Previous Integer Value:" + prev_int_val);
			 */

			System.out.println(alListIter.previous());
			
		}

	}

	public static void main(String[] args) {

		IteratorListIterator Iter_List_Iter = new IteratorListIterator();

	}

}