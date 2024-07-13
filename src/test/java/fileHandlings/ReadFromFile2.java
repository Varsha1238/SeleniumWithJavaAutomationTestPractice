package fileHandlings;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile2 {

	public static void main(String[] args) throws IOException 
	{
		File fr = new File("C:\\DemoSpace\\WriteFile.txt");
		Scanner reader = new Scanner(fr);
		
		while(reader.hasNextLine())
		{
			 String nextLine = reader.nextLine();
			 System.out.println(nextLine);
		}
		
		        
	}
}
