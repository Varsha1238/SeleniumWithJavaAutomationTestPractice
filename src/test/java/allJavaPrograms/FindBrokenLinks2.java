package allJavaPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> brokenLinks = new HashSet<String>();
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			
			if(!(links.get(i).getText().isEmpty()))
			{
				System.out.println(links.get(i).getText());
				URL url = new URL(links.get(i).getAttribute("href"));
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				huc.connect();
				int responseCode = huc.getResponseCode();
				if(responseCode!=200)
					brokenLinks.add(links.get(i).getAttribute("href"));	
				
			}
		}
		
		for(String brokenUrl : brokenLinks)
		{
			System.err.println(brokenUrl);
		}
		
		
	}

}
