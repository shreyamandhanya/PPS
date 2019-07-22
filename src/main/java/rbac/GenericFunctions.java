package rbac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class GenericFunctions {

public static WebDriver driver;

public static void ButtonEnabled(WebElement xpath)
{
	try 
	{
	boolean web = xpath.isEnabled();
	Assert.assertEquals(web, true);
   }catch(Exception e) {
	System.out.println("failed test case");
}
}

public static void ButtonDisplayed(WebElement xpath)
{
	try {
	boolean web = xpath.isDisplayed();
	Assert.assertEquals(web, true);
	}catch(Exception e) {
		System.out.println("failed test case");
	}
}

public static void ButtonDisabled(WebElement xpath)
{
	try 
	{
	boolean web = xpath.isEnabled();
	Assert.assertEquals(web, false);
   }catch(Exception e) {
	System.out.println("failed test case");
}
}

public static void ButtonNotDisplayed(WebElement xpath)
{
	try {
	boolean web = xpath.isDisplayed();
	Assert.assertEquals(web, false);
	}catch(Exception e) {
		System.out.println("failed test case");
	}
}

public static void check(String function, WebElement xpath)
{
	switch(function) {
	case "enabled":
	ButtonEnabled(xpath);
	xpath.click();
	break;
	
	case "disabled":
	ButtonDisabled(xpath);
	break;
	
	case "displayed":
	ButtonDisplayed(xpath);
	break;
	
	case "Notdisplayed":
	ButtonNotDisplayed(xpath);
	break;
	}
}

  public static void ImplicitWait(WebDriver driver) {
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   } 

static void WaitforPagetoLoad(WebDriver driver) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("return document.readyState").toString().equals("complete");
	}

static void ExplicitWait() {
	Wait wait = new FluentWait(driver).withTimeout(3,TimeUnit.SECONDS).pollingEvery(3,TimeUnit.SECONDS).ignoring(Exception.class);
}
}
