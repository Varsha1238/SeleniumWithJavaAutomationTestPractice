package fileHandlings;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\DemoSpace\\CreateFile.txt");
		
		if (f.createNewFile()) 
		{
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.length());
			System.out.println(f.getAbsolutePath());
			System.out.println("File created "+f.getName());
		}
		else
		{
			f.delete();
			f.createNewFile();
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.length());
			System.out.println(f.getAbsolutePath());
			System.out.println("File created "+f.getName());
		}
		
	
	}

}
