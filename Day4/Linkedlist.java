package Day4project;

import java.util.ArrayList;

public class Linkedlist {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(400);
		arrlist.addFirst(700);
		arrlist.addLast(2000);
		
		//
		System.out.print(arrlist.get(2));
		System.out.print(arrlist.remove(1));
		System.out.print("//");
		System.out.print(arrlist);
	}

}
