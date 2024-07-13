package fileHandlings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream inStream = null;
		FileOutputStream outStream = null;

		try {
			inStream = new FileInputStream("C:\\DemoSpace\\Source.txt");
			outStream = new FileOutputStream("C:\\DemoSpace\\Destination.txt");
			int content;
			while ((content = inStream.read()) != -1) 
			{
				outStream.write((byte) content);
			}
		}
		finally
		{
			System.out.println("Successfully performed read and write operation");
			inStream.close();
			outStream.close();
		}
	}

}
