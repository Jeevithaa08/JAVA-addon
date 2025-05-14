package Newproject;
import java.io.*;
public class BufferedReader {
	public static void main(String[] args) {
		try {
			  BufferedReader r1 = new BufferedReader(new FileReader("‪‪‪‪C:\\Test\\sample.txt"));
			String line;
			System.out.println("Reading file line by line:");
			while ((line = r1.readLine()) != null) {
				System.out.println(line);
			}
			r1.close();
			} catch (IOException e) {
				System.out.println("Error reading file:" + e.getMessage());
		}
	}
}
‪