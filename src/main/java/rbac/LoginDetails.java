package rbac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetails {
	static WebDriver driver;
	public static void Login(WebDriver driver1, String username, String password) throws Throwable  {
		driver= driver1;
		    WebElement Username= driver.findElement(By.xpath("//div/input[@formcontrolname='userName']"));
			Username.clear();
			Username.sendKeys(username);
			WebElement Password= driver.findElement(By.xpath("//div/input[@formcontrolname='password']"));
			Password.clear();
			Password.sendKeys(password);
			WebElement Login = driver.findElement(By.xpath("//div/button[contains(text(), 'Login')]"));
			Login.click();
			Thread.sleep(5000);
	}
}
