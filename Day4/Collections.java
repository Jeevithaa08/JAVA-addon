package Day4project;
import java.util.*;
public class Collections {
	public static void main(String[] args) {
		//for Strings
		/*ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("hello");
		
		//for Integers
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(100);
		arrlist.add(200);
		
		//without declaring the data types 
		ArrayList arrlist = new ArrayList();
		arrlist.add("hello");
		
		arrlist.add(100);
		arrlist.add(200);
		System.out.println(arrlist);*/
		
		/*ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			arrlist.add(i);
			System.out.println(arrlist);
		}*/
		
		//"for each" method
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(200);
		arrlist.add(100);
		arrlist.add(300);
		arrlist.add(200);
		System.out.println(arrlist.get(0)); //getting the value
		System.out.println(arrlist.set(3, 600));  //setting the value with another value
		System.out.println("/////////////////");  
		for(int i:arrlist) {
			System.out.println(i);
		}
		
		
		
	}

}
