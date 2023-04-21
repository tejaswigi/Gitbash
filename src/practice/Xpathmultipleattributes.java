package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmultipleattributes 
{
  public static void main(String[] args)
  {
	WebDriver driver=new ChromeDriver ();
	driver.get("https:demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	//multiple attributes in a single xpath using AND,OR operator
		driver.findElement(By.xpath("//input[@id=\"username\" and @class=\"textField\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@placeholder=\"Password\" or @name=\"pwd\"]")).sendKeys("manager");
			
			//text() function with multiple attributes
			driver.findElement(By.xpath("//a[text()='View Time-Track' and @class='item']")).click();
			
			
}
 
}
