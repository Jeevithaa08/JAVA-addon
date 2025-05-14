package Day3Project;
import java.util.*;
class Oops {
	
		//Variables (Att)
	String name="raj";
	int rollNum=21;
	String dept="CS";
		
		//to create method use void display data
	void displayData()
	{
	System.out.println("My name is:" +name);
	System.out.println("My name is:" +rollNum);
	System.out.println("My name is:" +dept);
			
}
}
	
	public class Clsobj {
		public static void main(String[] args) {
			Oops obj = new Oops(); // classname objname = new classname() [consider class name ass method]
			obj.displayData();
			
		}
	}

