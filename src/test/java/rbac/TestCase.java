package rbac;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase 
{
 static WebDriver driver;
  @BeforeMethod
  public void SetUp()
  {
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://192.168.96.45:8080/#/login");
	driver.manage().window().maximize();
   }
		 
	@Test()
	public void Test() throws Throwable {
		LoginDetails.Login(driver, "admin@pps.com", "Diaspark@123");
		Verifications.StudentsVerify(driver, "disabled");
	 }
	@AfterMethod()
	public static void TearDown()
	{
		driver.close();
	}
	}
