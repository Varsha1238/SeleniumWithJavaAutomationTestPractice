package SeleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PageClass {
	@FindBy(name="proceed")
	@FindAll(value = { @FindBy })
	@FindBys(value = { @FindBy })
	public WebElement signin;

}
