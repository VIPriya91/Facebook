package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://adactin.com/HotelApp/");
		
		
		driver.findElement(By.xpath("//td[@align='center']")).click();
		driver.findElement(By.id("username")).sendKeys("098706appys");
		driver.findElement(By.id("password")).sendKeys("passout");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("passout");
		driver.findElement(By.xpath("(//input[contains(@name,'full_name')])")).sendKeys("Hotel");
		driver.findElement(By.xpath("(//input[contains(@id,'email_add')])")).sendKeys("gannushree91@gmail.com");
		//driver.findElement(By.id("captcha")).getText();
		//driver.findElement(By.id("captcha-form"));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(15000);		
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
		Thread.sleep(5000);
	

		
	
	}
}