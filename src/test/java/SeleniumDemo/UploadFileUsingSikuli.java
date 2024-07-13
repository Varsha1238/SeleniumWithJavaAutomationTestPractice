package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UploadFileUsingSikuli {
	WebDriver driver;
	String Browser="chrome";
	@Test
	public void testCase1() throws Throwable{
		SoftAssert st=new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver(); //openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(Browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
	
		driver.get("https://pdf2doc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on uploadfile
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/label")).click();
		//Sikuli
        Screen sc = new Screen();
        sc.paste("C:\\Users\\varsh\\Desktop\\Sikuli\\FileName.png", "C:\\Users\\varsh\\Documents\\Varsha_Kulkarni_AutomationTesting.pdf");
        
}

}
