package sample1;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhandle {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		String wina = driver.getWindowHandle();
		System.out.println(wina);
		
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		WebElement mob1 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[3]"));
		mob1.click();
		
		WebElement mob2 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[5]"));
		mob2.click();
		
		WebElement mob3 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[8]"));
		mob3.click();
		
		Set<String> winHandles = driver.getWindowHandles();
		for (String sos : winHandles) {
			System.out.println(sos);
			String t2 = driver.getTitle();
					
			if(!t1.equals(t2)){
				System.out.println(t2);
			}
		}
}
}