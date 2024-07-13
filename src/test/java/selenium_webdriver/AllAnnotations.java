package selenium_webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {
	@Test
	public void testCase1(){
		//selenium code to composemail
		System.out.println("composemail");
	}
	
	@Test
	public void testCase2(){
		//selenium code to savemail
		System.out.println("savemail");
	}
	@Test
	public void testCase3(){
		//selenium code to Deletemail
		System.out.println("Deletemail");
	}
	@BeforeMethod
	public void bmethod(){
		System.out.println("openBrowser,url,Login");
	}
	@AfterMethod
	public void amethod(){
		System.out.println("Logout,closeBrowser");
	}	
		
		@BeforeTest
		
		public void beforeTest()
		{
			System.out.println("Before all tests");
		}
		
	
	@BeforeClass
	public void bclass(){
		System.out.println("Start server");
	}
	@AfterClass
	public void aclass(){
		System.out.println("Shutdown server");
	}

    }


