package rbac ;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Property
{
	public static WebDriver driver;
	
	public static WebElement Homepage(WebDriver value1) throws IOException {
		driver= value1;
		WebElement Home = driver.findElement(By.xpath("a//[contains(@href='#/main/home')]"));
		return Home;
	}

	public static WebElement Providers(WebDriver value1) throws InterruptedException {
		driver= value1;
		WebElement Provider = driver.findElement(By.xpath("a//[@href = '#/main/providers']"));
		return Provider; 
	 }

	public static WebElement Student(WebDriver value1) throws IOException, Throwable {
		driver= value1;
		Thread.sleep(5000);
		WebElement Students = driver.findElement(By.xpath("//a[@href='#/main/student']"));
		return Students;
		}
		
	public static WebElement Enrollments(WebDriver value1 ) throws IOException {
		driver= value1;
		WebElement Enrollments = driver.findElement(By.xpath("//a[@href='#/main/enrollments']"));
		return Enrollments;
		}

	public static WebElement Reports(WebDriver value1 ) throws IOException {
		driver= value1;
		WebElement Reports = driver.findElement(By.xpath("//a[@href='#/main/reports']"));
		return Reports;
		}

	 public static WebElement Admin(WebDriver value1 ) throws IOException {
			driver= value1;
			WebElement Admin =driver.findElement(By.xpath("//a[@href= '#/main/admin']"));
			return Admin;
			}

	public static void SearchStudent(WebDriver value1) throws Throwable{
		driver = value1;
	    Student(value1);
		WebElement Searchbar = driver.findElement(By.xpath("//input[@id ='mat-input-0']"));
		Searchbar.sendKeys("John");
		driver.findElement(By.xpath("//div/button/span[@class= 'mat-button-wrapper']")).click();
		driver.findElement(By.xpath("//h5/mat-label[contains(text(),'JOHN')][1]")).click();
	}

	public static WebElement ViewStudentProfile() {
		WebElement StudentProfile = driver.findElement(By.xpath("//a[@href ='#/main/student/studentInfo/studentProfile']"));
		return StudentProfile;
	}
	
	public static WebElement ViewStudentRedFlag() {
		WebElement StudentRedFlag = driver.findElement(By.xpath("//a[@href ='#/main/student/studentInfo/redFlag']"));
		return StudentRedFlag;
	}
	
	public static WebElement ViewStudentGrowthPlan() {
		WebElement StudentGrowthPlan = driver.findElement(By.xpath("//a[@href='#/main/student/studentInfo/indicatorsForAction/indicatorList']"));
		return StudentGrowthPlan;
	}
	 
	public static WebElement ViewStudentPathway() {
		WebElement StudentPathway = driver.findElement(By.xpath("//a[@href='#/main/student/studentInfo/pathway']"));
		return StudentPathway;
	}
	
	public static WebElement ViewStudentEnrollment() {
		WebElement StudentEnrollment = driver.findElement(By.xpath("//a[@href='#/main/student/studentInfo/enrollment']"));
		return StudentEnrollment;
	}

	public static WebElement ViewStudentDocuments() {
		WebElement StudentDocuments = driver.findElement(By.xpath("//a[@href='#/main/student/studentInfo/documents']"));
		return StudentDocuments;
	}
	
	public static WebElement ViewStudentNotes() {
		WebElement StudentNotes = driver.findElement(By.xpath("//a[@href='#/main/student/studentInfo/notes/viewNotes']"));
		return StudentNotes;
	}

	public static void ChangePassword(WebDriver value) {
		driver= value;
		driver.findElement(By.xpath("//button[@class= 'user-proile']")).click();
		  driver.findElement(By.xpath("//button[contains(text(), 'Change Password')]")).click();
		  driver.findElement(By.cssSelector("input#password")).sendKeys("Diaspark@123");
		  driver.findElement(By.cssSelector("input#newPassword")).sendKeys("Diaspark@1234");
		  driver.findElement(By.cssSelector("input#confirmNewPassword")).sendKeys("Diaspark@1234");
		  driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
		  String str1= driver.findElement(By.xpath("//div/h4[contains(text(), 'User Added')]")).getText();
		  System.out.println(str1);
	}

	public static void AddNewUser(WebDriver value) throws IOException, InterruptedException {
		driver= value;
		Admin(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Add New User')]")).click();
		WebElement Title= driver.findElement(By.xpath("//span[contains(text(), 'Title')]"));
		Title.clear();
		WebElement FirstName= driver.findElement(By.cssSelector("input[formcontrolname=userFirstName]"));
		FirstName.sendKeys("Shreya");
		WebElement LastName= driver.findElement(By.cssSelector("input[formcontrolname=userLastName]"));
		LastName.sendKeys("Shreya");
		WebElement Email= driver.findElement(By.cssSelector("input[formcontrolname=userEmail]"));
		Email.sendKeys("shreya.mandhanya@diaspark.com");
		WebElement Phone= driver.findElement(By.cssSelector("input[formcontrolname=userPhone]"));
		Phone.sendKeys("");
		WebElement Ext= driver.findElement(By.cssSelector("input[formcontrolname=userPhoneExt]"));
		Ext.sendKeys("022");
		WebElement Cell= driver.findElement(By.cssSelector("input[formcontrolname=userPhoneCell]"));
		Cell.sendKeys("7898847479");
		WebElement Fax= driver.findElement(By.cssSelector("input[formcontrolname=userFax]"));
		Fax.sendKeys("7898847479");
		WebElement Role= driver.findElement(By.xpath("//span[contains(text(), ' Family Support Specialist Supervisor ')]"));
		Role.click();
		WebElement RoleSubmit= driver.findElement(By.xpath("//button[contains(text(), 'Done')]"));
		RoleSubmit.click();
		WebElement Provider= driver.findElement(By.xpath("//span[@class= 'mat-option-text'][1]"));
		Provider.click();
	    WebElement School= driver.findElement(By.xpath("//span[contains(text(), ' 1036 Refuge Temple Non-Secure  ')]"));
		School.click();
		WebElement SchoolSubmit = driver.findElement(By.xpath("//span[contains(text(), 'Done')]"));
		SchoolSubmit.click();
		}
}

