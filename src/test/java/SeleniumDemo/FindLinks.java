package SeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindLinks {

	public static void main(String[] args) {
		
	

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']"))));
		

		List<WebElement> findElements = driver.findElements(By.tagName("a"));


		for (int i = 0; i < findElements.size(); i++) {

			if (!findElements.get(i).getText().isEmpty()) {
				System.out.println(findElements.get(i).getText());
			}

		}

	}
}
