package Day3Project;
import java.util.*;
class Calculculator{
	int inp1;
	int inp2;
	int total;
	void add() {
		total=inp1+inp2;
		System.out.println("Total:"+total);
		
	}

}



public class Clsobj {
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.inp1 = 100;
		obj.inp2 = 200;
		obj.add();
	}
}


