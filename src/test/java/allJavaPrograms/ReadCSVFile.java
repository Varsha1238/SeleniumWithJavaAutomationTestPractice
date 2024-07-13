package allJavaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSVFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr =new FileReader("C:\\DemoSpace\\TestDemo\\organizations100.csv");
		int content;
		
		while((content=fr.read())!=-1)
		{
			System.out.print((char)content);
		}
		
		fr.close();
		Scanner sc =new Scanner(new File("C:\\DemoSpace\\TestDemo\\organizations100.csv"));
		while(sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);	
		}
		
	}

}
