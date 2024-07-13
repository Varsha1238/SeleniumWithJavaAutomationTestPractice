package fileHandlings;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("C:\\DemoSpace\\Source.txt");
			writer = new FileWriter("C:\\DemoSpace\\Destination.txt");
			
			int content ;
			
			while ((content = reader.read()) != -1)
			{
				writer.write((char) content);
			}
		} 
		finally 
		{
			System.out.println("Successfully performed read and write operation");
			reader.close();
			writer.close();
		}
	}

}
