 package sample1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sam2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://greenstech.in/selenium-course-content.html");
	Thread.sleep(2000);
	WebElement courses = driver.findElement(By.className("activeLink"));
	Actions a=new Actions(driver);//mouse over
	a.moveToElement(courses).build().perform();
	Thread.sleep(2000);
	
	WebElement oracle = driver.findElement(By.xpath("//span[contains(text(),'Oracle Training')]"));
	
	a.moveToElement(oracle).build().perform();
	Thread.sleep(2000);
	WebElement DBA =driver.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
	
	a.moveToElement(DBA).build().perform();
	DBA.click();
	Thread.sleep(2000);
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Screenshots\\text.png");
	FileUtils.copyFile(temp, destination);
	Thread.sleep(2000);
	driver.close();
	
	}}
