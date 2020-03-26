package sample1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		 
	  
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		
	    driver.findElement(By.xpath("//span[@data-cy='hotelCityLabel']")).click();
	    driver.findElement(By.id("city")).click();
	    WebElement arname = driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
	    
	    JavascriptExecutor jm= (JavascriptExecutor) driver;
	    jm.executeScript("arguments[0].setAttribute('value','Chennai')", arname);
	    Thread.sleep(5000);
	    WebElement cli = driver.findElement(By.className("Chennai Airport, Chennai"));
	    jm.executeScript("arguments[0].click()", cli);
		
//	  Robot r = new Robot();
//      r.keyPress(KeyEvent.VK_DOWN);
//      r.keyRelease(KeyEvent.VK_DOWN);
//      r.keyPress(KeyEvent.VK_DOWN);
//      r.keyRelease(KeyEvent.VK_DOWN);
//      r.keyPress(KeyEvent.VK_DOWN);
//      r.keyRelease(KeyEvent.VK_DOWN);
//      r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		driver.findElement(By.id("checkin")).click();
		driver.findElement(By.xpath("(//div[text()='31'])[2]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("(//div[text()='20'])[2]")).click();
		driver.findElement(By.id("guest")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-2']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
	    
	   	
}

}


//WebElement from = driver.findElement(By.id("fromCity"));
//from.sendKeys("Mumbai");
//
//WebElement to = driver.findElement(By.id("toCity"));
//to.sendKeys("Chennai");
//
//driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
//driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[36]")).click();
//driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[45]")).click();
