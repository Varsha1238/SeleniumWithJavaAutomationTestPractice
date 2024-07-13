package SeleniumDemo;

import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.file.FileUtil;
import com.sun.jna.platform.FileUtils;

public class TakeScreenShot {
	
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
	
		driver.get("https://www.drikpanchang.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		//TakescreenShot	
		//Method 1
		//File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(f, new File("Testpic.png"));
		//Method 2
		//Shutterbug.shootPage(driver).withName("TestpicWiths").save();
		//Method 3-Full screen
		//Shutterbug.shootPage(driver, Capture.FULL).withName("Fullscreen").save();
		//Method 4-to take expected image only
		//WebElement logo = driver.findElement(By.xpath("/html/body/header/a[2]/img"));
		//Shutterbug.shootElement(driver, logo).withName("ExpLogo").save();
		//Method 5-to take expected image only
		WebElement logo = driver.findElement(By.xpath("/html/body/header/a[2]/img"));
		//Shutterbug.shootElement(driver, logo).withName("ExpLogo").save();
		boolean results = Shutterbug.shootElement(driver, logo).equals(ImageIO.read(new File("screenshots\\ExpLogo.png")));
		st.assertEquals(results, true);	
		st.assertAll();
	
	     
		
	}

}
