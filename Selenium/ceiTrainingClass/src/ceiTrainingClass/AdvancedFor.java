package ceiTrainingClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AdvancedFor {
	
	public static void mapMethod(){
		
		Map <String,Integer> map = new HashMap<String,Integer>();
		map.put("Karthikeyan", 100);
		map.put("Dhanasekar", 200);
		map.put("Varadhan", 300);
		map.put("Sathya",400);
		
				
		for(Map.Entry m : map.entrySet()){

			System.out.println("The Key is"+" "+m.getKey()+""+"The value is"+m.getValue());
			
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapMethod();
	
		char [] s = {'k','d','f'};
		
		List <Character> arlist = new ArrayList<Character>();
		
					
		for(int i=0;i<s.length;i++){
			
			arlist.add(s[i]);
			//System.out.println(s[i]);
		}
		
		
		for(char j:arlist){
			
			System.out.println(j);
			
		}
		
		
		

	}

}
