package javaCollectionInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashSet {
	
	
	public static void main(String args[]){
		
		
		Set<String> hset = new LinkedHashSet<String>();
		
		hset.add(null);
		hset.add("A");
		hset.add("B");
		hset.add("C");
		hset.add("E");
		hset.add("D");
		hset.add("A");
		
		for(String val : hset)
			
			System.out.println(val);
		
		
		
	}
	
	
	

}
