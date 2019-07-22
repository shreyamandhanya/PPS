package rbac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EnvironmentVariables {

	static WebDriver driver;
	
	public static void SetUp(String browser) 
	{
	switch(browser) {
	case "chromedriver":
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
	break;
	
	case "InternetExplorer":
		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Common Files\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		break;
		
	case "FireFox":
		System.setProperty("webdriver.geko.driver", "");
		break;

}
}
}