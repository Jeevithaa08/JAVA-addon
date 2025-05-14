package Newproject;
import java.io.*;
public class Reader {
	public static void main(String[] args) {
		try {
			FileReader r1 = new FileReader("./example.txt");
			int character;
			while ((character = r1.read()) != -1) {
				System.out.print((char) character);
			}
			r1.close();
		} catch (IOException e) {
			System.out.println("An error occured: " + e.getMessage());
		}
		
	}
}
