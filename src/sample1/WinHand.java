package sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHand {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		String pid = driver.getWindowHandle();
		String t1 = driver.getTitle();
		System.out.println(pid);
		System.out.println(t1);
		
		WebElement prod1 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[1]"));
		prod1.click();
		Thread.sleep(5000);
		WebElement prody2 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[3]"));
		prody2.click();
		Thread.sleep(5000);
		WebElement prodz3 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[4]"));
		prodz3.click();
		Thread.sleep(5000);
		
		Set<String> pids = driver.getWindowHandles();
//		for (String str : pids) {
//			
//		 String t2 = driver.switchTo().window(str).getTitle();
//		 System.out.println(str);
//			System.out.println(t2);
//					}
		
		
//		List <String> l= new ArrayList <String>();
//		l.addAll(pids);
//		for (int i = 0; i < l.size(); i++) {
//			driver.switchTo().window(l.get(i));
//			System.out.println("index: "+i+" ;Title: "+driver.getTitle());	
//		}
		
		List <String> l= new ArrayList <String>();
		l.addAll(pids);
		for (int i = 0; i < l.size(); i++) {
			driver.switchTo().window(l.get(i));
			String curl = driver.getCurrentUrl();
			String t2 = driver.getTitle();
//			if(t2.equals("give the title that you want"))
		}
		
//		driver.switchTo().window(l.get(i));
//		"add to cart steps"
		
		
}
}