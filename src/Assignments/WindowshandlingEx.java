package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowshandlingEx 
{
  public static void main(String[] args) throws Throwable
  {
	  WebDriver driver=WebDriverManager.edgedriver().create();
	  driver.get("https://www.naukri.com/");
WebElement jobs= driver.findElement(By.xpath(" //div[text()='Jobs']"));

	  Actions act=new Actions(driver);
	  act.moveToElement(jobs).build().perform();
	  
	  driver.findElement(By.linkText("Jobs by skill")).click();
	  Thread.sleep(4000);	
		
			driver.findElement(By.xpath(" //div[text()='Services']")).click();
			
			//switch to new window
			
			String mainid=driver.getWindowHandle();
			System.out.println(mainid);
			
			Thread.sleep(1000);
			Set<String> allid=driver.getWindowHandles();
			for(String id:allid)
			{
				// System.out.println(id);
				if(!mainid.equals(id))
				{
				driver.switchTo().window(id);
				System.out.println(id);
				}
			}
			Thread.sleep(2000);
			driver.switchTo().window(mainid);
				
				
	
}
}

  

