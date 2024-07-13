package fileHandlings;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("C:\\DemoSpace\\WriteFile.txt");
		fw.write("This is demo for writing into files");
        fw.close();
        System.out.println("Successfully wrote to the file");         
	}
}
