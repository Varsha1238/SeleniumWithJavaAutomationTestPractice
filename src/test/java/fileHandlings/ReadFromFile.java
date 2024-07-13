package fileHandlings;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("C:\\DemoSpace\\WriteFile.txt");
		int character;
		while((character=fr.read())!=-1)		
		{
			System.out.print((char)character);
		
		}
		
        fr.close();
        System.out.println("\nSuccessfully read from the file");         
	}
}
