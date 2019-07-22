package rbac;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Verifications {

	static WebDriver driver;
	public static void StudentsVerify(WebDriver driver, String function) throws Throwable {
	Property.Student(driver);
	GenericFunctions.ButtonEnabled(Property.Student(driver));
	GenericFunctions.check(function, Property.Student(driver));
}
}
