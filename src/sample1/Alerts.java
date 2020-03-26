package sample1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	//Thread.sleep(2000);
//	WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
//	simple.click();
//	//Thread.sleep(2000);
//	//driver.close();
//Alert a = driver.switchTo().alert();
//	Thread.sleep(8000);
//	a.accept();
	
	//Thread.sleep(2000);
	
//	WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
//	confirm.click();
//	Alert c = driver.switchTo().alert();
//	Thread.sleep(5000);	
//
//	c.dismiss();
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,400)");
	
	WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
	prompt.click();
	Alert p = driver.switchTo().alert();
	Thread.sleep(5000);	
String text = p.getText();
	System.out.println(text);
}
}