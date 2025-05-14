package Day4project;
import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 3);
		map.put("Banana", 2);
		map.put("Orange", 9);
		System.out.println("Hashmap:" + map);
		
		//get method
		System.out.println("Apple count:" + map.get("Apple"));
		
		//contains keys
		if(map.containsKey("Banana")) {
			System.out.println("Banana is in the map");
		}
		
		//Removing the value
		map.remove("Orange");
		System.out.println("After removing orange:" + map);
		
		//Finding the size
		System.out.println("Size of HashMap: " +map.size());
		
		//
		System.out.println("Iterating using entrySet: ");
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()); 
			
	    //Iterating using key sets
			System.out.println("Iterating using keyset :" );
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
