package Newproject;
import java.io.*;
public class BufferedWriter {
	public static void main(String[] args) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Test\\sample.txt"));
			Writer.write("Java file handling example");
			writer.newLine();
		writer.write("java file");
			writer.write("Bufferedwriter makes writing more efficient");
			writer.close();
		System.out.println("Data is writen");
			
} catch (IOException e) {
		System.out.println("error" +e.getMessage());
		}
	}
}
