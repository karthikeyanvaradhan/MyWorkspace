package com.test.programs.AbstractionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	MapInterface() {

		Map<Integer, String> mapStudent = new HashMap<Integer, String>();

		mapStudent.put(100, "Karthikeyan Varadhan");
		mapStudent.put(101, "Dhanasekar");
		mapStudent.put(102, "Varadhan");
		mapStudent.put(103, "Sathya");
		mapStudent.put(null, "Jacky");
		mapStudent.put(104, null);

		for (Entry<Integer, String> mapStudIterator : mapStudent.entrySet()) {

			if(mapStudIterator.getKey()==null){
				
				System.out.println("The Null Key which has a value is:"+"              "+mapStudIterator.getValue());
			}
			
			System.out.println(
					"The Key"+"   "+ mapStudIterator.getKey() + "---------->" + "The Value"+"    "+ mapStudIterator.getValue());
		}

	}

	public static void main(String[] args) {

		MapInterface insMap = new MapInterface();

	}

}
