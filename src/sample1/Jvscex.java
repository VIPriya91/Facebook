package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jvscex {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		WebElement serach = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','mobiles')", serach);
		
		WebElement ser = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
		js.executeScript("arguments[0].click()", ser);
		
}
}