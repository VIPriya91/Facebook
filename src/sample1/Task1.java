package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
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
	
	WebElement emailin = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
	emailin.click();
	emailin.sendKeys("12345@pracmail.com");
	
	Thread.sleep(2000);	
	driver.findElement(By.id("SubmitCreate")).click();
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'id_gender1')]")).click();	
	//driver.findElement(By.xpath("(//label[@class='top'])[1]")).click();	
	
	driver.findElement(By.xpath("(//input[@data-validate='isName'])[1]")).sendKeys("My");
	driver.findElement(By.xpath("(//input[@data-validate='isName'])[2]")).sendKeys("Name");
	driver.findElement(By.id("passwd")).sendKeys("12345");
	
	WebElement DDay = driver.findElement(By.id("days"));
	Select d=new Select(DDay);
	d.selectByValue("7");
	Thread.sleep(2000);
	WebElement DMonth = driver.findElement(By.id("months"));
	Select m=new Select(DMonth);
	m.selectByValue("2");
	Thread.sleep(2000);
	WebElement DYear = driver.findElement(By.id("years"));
	Select y=new Select(DYear);
	y.selectByValue("1989");
	Thread.sleep(2000);
	driver.findElement(By.id("newsletter")).click();
	
	driver.findElement(By.id("firstname")).sendKeys("My");
	driver.findElement(By.id("lastname")).sendKeys("Name");
	driver.findElement(By.id("company")).sendKeys("Yaari");
	driver.findElement(By.id("address1")).sendKeys("Street 4");
	driver.findElement(By.id("address2")).sendKeys("Appartment 5");  
	driver.findElement(By.id("city")).sendKeys("Chennai");
	
	WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
	Select s=new Select(state);
	s.selectByValue("7");
	Thread.sleep(2000);
	
	driver.findElement(By.id("postcode")).sendKeys("20006");
	
	WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[5]"));
	Select c=new Select(country);
	c.selectByValue("21");
	Thread.sleep(2000);
	
	driver.findElement(By.id("phone")).sendKeys("9876543210");
	driver.findElement(By.xpath("(//input[@class='form-control'])[8]")).sendKeys("9021345678");
	driver.findElement(By.id("alias")).sendKeys("Nom");  
	driver.findElement(By.id("submitAccount")).click();
	Thread.sleep(1000);
	
//	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
//	Actions a =new Actions(driver);
//	a.moveToElement(women).build().perform();
//	Thread.sleep(1000);
//		
//	WebElement ts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
//	a.moveToElement(ts).click();
//	Thread.sleep(1000);
//	
	
	
	}
}
