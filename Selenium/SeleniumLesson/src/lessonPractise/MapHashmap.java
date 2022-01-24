package lessonPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapHashmap {
	
	
	public static void data(){
		
		Map <String,String> phonebook = new HashMap<>();
		phonebook.put("Karthikeyan", "7299090405");
		phonebook.put("Dhanasekar","9940550469");
		phonebook.put("Sathya","9087820163");	
		
		phonebook.replace("Karthikeyan", "9840498504");
		
		
		
		String phoneNo = phonebook.get("Karthikeyan");
		
		System.out.println(phoneNo);
		
		
		Set<Map.Entry<String,String>> phname = phonebook.entrySet();
		
		for(Entry<String, String> no:phname){
			
			System.out.println("Key Name is:"+no.getKey()+"Phone no is:"+no.getValue());
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MapHashmap ma = new MapHashmap();
		ma.data();

	}

}
