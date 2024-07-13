package allJavaPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
			for(int i=0;i<links.size();i++)
			{
				
				if(!(links.get(i).getText().isEmpty()))
				{
					System.out.println(links.get(i).getText());
					
					URL url =new URL(links.get(i).getAttribute("href"));
					HttpURLConnection huc = (HttpURLConnection)url.openConnection();
					huc.connect();
					huc.setConnectTimeout(10000);
					int responseCode = huc.getResponseCode();
					
					if(responseCode>=400)
					{
						System.out.println("broken links");
					}
					else
					{
						System.out.println("not broken links");
					}
				}
				
			}
		

	}

}
