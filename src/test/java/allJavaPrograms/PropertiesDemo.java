package allJavaPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Properties prop =new Properties();
		prop.load(new FileReader("C:\\DemoSpace\\TestDemo\\src\\test\\resources\\Global.properties"));
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("URL"));
		
		
		prop.setProperty("User123", "PassWord");
		prop.store(new FileWriter("C:\\DemoSpace\\TestDemo\\src\\test\\resources\\Global.properties"), "User Details");
	}

}
