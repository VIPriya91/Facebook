package sample1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2a {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.adactin.com/HotelApp/");
		
		driver.findElement(By.id("username")).sendKeys("098706appy");
		driver.findElement(By.id("password")).sendKeys("passout");
		driver.findElement(By.id("login")).click();

        WebElement dloc = driver.findElement(By.id("location"));
        Select dl=new Select(dloc);
        dl.selectByValue("Adelaide");
        //Thread.sleep(1000);
        
        WebElement dhot = driver.findElement(By.id("hotels"));
        Select dh=new Select(dhot);
        dh.selectByValue("Hotel Sunshine");
        //Thread.sleep(1000);
        
        WebElement drt = driver.findElement(By.xpath("//select[contains(@id,'room_type')]"));
        Select dt=new Select(drt);
        dt.selectByValue("Standard");
        //Thread.sleep(1000);
        
        WebElement drn = driver.findElement(By.xpath("//select[contains(@id,'room_nos')]"));  
        Select dn=new Select(drn);
        dn.selectByValue("7");
        //Thread.sleep(1000);
        
        WebElement chekin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        chekin.clear();
        chekin.sendKeys("25/01/2020");
        //Thread.sleep(1000);
        
        WebElement chekot = driver.findElement(By.xpath("//input[contains(@id,'datepick_out')]"));
        chekot.clear();
        chekot.sendKeys("27/01/2020");  
        //Thread.sleep(1000);
        
        WebElement dap = driver.findElement(By.xpath("//select[contains(@id,'adult_room')]"));  
        Select da=new Select(dap);
        da.selectByValue("3");
        //Thread.sleep(1000);
        
        WebElement dac = driver.findElement(By.xpath("//select[contains(@id,'child_room')]"));  
        Select dc=new Select(dac);
        dc.selectByValue("4");
        //Thread.sleep(1000);
        
        driver.findElement(By.id("Submit")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("continue")).click();
       Thread.sleep(1000);
        
        driver.findElement(By.id("first_name")).sendKeys("Hotel");
        //Thread.sleep(1000);
        
        driver.findElement(By.id("last_name")).sendKeys("Mani");
       // Thread.sleep(1000);
        
        driver.findElement(By.id("address")).sendKeys("345, CMDA Colony, Chennai");
       // Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[contains(@id,'cc_num')]")).sendKeys("9876012343211234");
        //Thread.sleep(1000);
        
        WebElement dct = driver.findElement(By.xpath("//select[contains(@id,'cc_type')]"));
        Select d=new Select(dct);
        d.selectByValue("AMEX");
        //Thread.sleep(1000);   
        
        WebElement dem = driver.findElement(By.xpath("//select[contains(@id,'cc_exp_month')]"));
        Select de=new Select(dem);
        de.selectByValue("3");
        //Thread.sleep(1000); 
        
        WebElement dey = driver.findElement(By.xpath("//select[contains(@id,'cc_exp_year')]"));
        Select dy=new Select(dey);
        dy.selectByValue("2022");
        //Thread.sleep(1000); 
        
        driver.findElement(By.xpath("//input[contains(@id,'cc_cvv')]")).sendKeys("9876");
       // Thread.sleep(1000);
        
        driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
        Thread.sleep(10000);
        
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(1000);
    	js.executeScript("window.scrollBy(0,600)");
    	Thread.sleep(5000);
    	
    	WebElement t = driver.findElement(By.id("order_no"));
    System.out.println(t.getText());
        Thread.sleep(1000);
      
        Thread.sleep(2000);
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File temp = ts.getScreenshotAs(OutputType.FILE);
    	File destination = new File("E:\\Eclipse neon\\eclipse\\Workspace\\seleniumpro\\Screenshots\\text3.png");
    	FileUtils.copyFile(temp, destination);
    	
    	
//    	driver.findElement(By.xpath("//input[contains(@id,'my_itinerary')]")).click();
//        Thread.sleep(3000);
    	//Thread.sleep(5000);
       driver.findElement(By.id("logout")).click();
        Thread.sleep(1000);
        
}
}