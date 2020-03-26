package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.toolsqa.com/automation-practice-table");
	
	WebElement tab = driver.findElement(By.tagName("table"));
	WebElement tbod = driver.findElement(By.tagName("tbody"));
	List<WebElement> trow = driver.findElements(By.tagName("tr"));
	//for (int i = 0; i < trow.size(); i++) {
//	//List<WebElement> thead = driver.findElements(By.tagName("th"));
//	System.out.println(trow.get(i).getText());
	
		
	for (WebElement tr : trow) {
		List<WebElement> tda = driver.findElements(By.tagName("td"));
		for (WebElement td : tda) {
			System.out.println(td.getText());
			
		}
		
	}	
		
	
	
}
}