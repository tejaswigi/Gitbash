package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chromebrowser 
{
	public static void main(String[] args) throws Throwable 
	{
		
	WebDriver driver=new EdgeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div.popup_menu_settings")).click();
	
	driver.findElement(By.linkText("Types of Work")).click();
	//driver.findElement(By.xpath("")
	
	
	}

}
