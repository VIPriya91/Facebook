package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1a {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("http://automationpractice.com/");
	
	WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	signin.click();
	
	JavascriptExecutor jb=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	jb.executeScript("window.scrollBy(0,400)");
	
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("12345@pracmail.com");
	driver.findElement(By.id("passwd")).sendKeys("12345");
	driver.findElement(By.id("SubmitLogin")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@title='Women']")).click();

	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[contains(text(),'Tops')])[2]")).click();  
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[contains(text(),'T-shirts')])[3]")).click();	
	Thread.sleep(1000);
	
	JavascriptExecutor jt=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	jt.executeScript("window.scrollBy(0,700)");
	Thread.sleep(2000);
	WebElement item = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[1]"));
	Actions v =new Actions(driver);
	v.moveToElement(item).build().perform();
	//v.click();
	
	driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
	Thread.sleep(1000);
	
	JavascriptExecutor ju=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	ju.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	
	JavascriptExecutor jv=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	jv.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	JavascriptExecutor jw=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	jw.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.id("cgv")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	JavascriptExecutor jx=(JavascriptExecutor) driver;
	//Thread.sleep(1000);
	jx.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	driver.findElement(By.className("bankwire")).click();
	
	JavascriptExecutor jy=(JavascriptExecutor) driver;
	jy.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	JavascriptExecutor jz=(JavascriptExecutor) driver;
	jz.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@title='Back to orders']")).click();   

	JavascriptExecutor ja=(JavascriptExecutor) driver;
	ja.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[5]")).click();

	Thread.sleep(1000);
	driver.findElement(By.className("logout")).click();
	
	Thread.sleep(6000);
	driver.close();	
}
}
