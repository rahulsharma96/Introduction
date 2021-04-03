package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Student {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	System.out.println("Browser invoked successfully");

	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Sushma");
	driver.findElement(By.name("lastname")).sendKeys("sharma");
	driver.findElement(By.name("reg_email__")).sendKeys("rahuldeveloper11@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Sushma123*");
	
	Select date = new Select(driver.findElement(By.id("day")));
	date.selectByValue("4");
	
	Select month = new Select(driver.findElement(By.id("month")));
	month.selectByValue("5");
	
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByValue("1996");
	
	driver.findElement(By.xpath("//input[@value='2']")).click();
	
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	System.out.println("Sucessfully created account ");
}	
}