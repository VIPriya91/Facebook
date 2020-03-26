package sample1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		WebElement he = driver.findElement(By.xpath("//a[text()='Gmail']"));
//		Actions a= new Actions(driver);
//		a.contextClick(he).perform();
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions a = new Actions(driver);
//		a.dragAndDrop(bank, desti).perform();
//		Thread.sleep(3000);
//		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		
//		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.clickAndHold(bank).moveToElement(desti).release(desti).perform();
		
		
		
	}

}
