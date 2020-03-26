package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);   // needs throws Throwable to be added in the class
	WebElement email = driver.findElement(By.id("email"));
	email.click();
	email.sendKeys("");
	
	/*WebElement pass = driver.findElement(By.id("pass"));
	pass.click();
	pass.sendKeys("12345");
*/	
	
	driver.findElement(By.id("pass")).sendKeys("");
	driver.findElement(By.id("loginbutton")).click();// take the id from label
	}

}
