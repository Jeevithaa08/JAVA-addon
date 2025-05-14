package Newproject;
import java.io.*;
public class Writer {
	public static void main(String[] args) {
		try {
		    //writing a file
			FileWriter w1 = new FileWriter("./example.txt");
			w1.write("Hello, Java I/O!");
			w1.close();
			System.out.println("Data written to file.");
		    }
			catch (IOException e) {
				System.out.println("Error" + e.getMessage());
		}
	}
}
