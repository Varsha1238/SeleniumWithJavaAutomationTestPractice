package selenium_webdriver;

import org.testng.annotations.Test;

public class HelloWorldTestNG {
  @Test
  public void launch() {
	  System.out.println("Launch");
  }
  
  @Test
  public void login() {
	  System.out.println("Login");
  }
  @Test
  public void create() {
	  System.out.println("Create");
  }
  @Test
  public void logout() {
	  System.out.println("logout");
  }
}
