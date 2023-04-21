package Advancescenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsex 
{
   private static final By Element = null;

public static void main(String[] args)
   {

		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//implicity wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		 
		 //Explicity wait
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.titleContains("Time-Track"));
		 
		 //syntax
		FluentWait wait1 =new FluentWait(driver);
		 wait.pollingEvery(Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(Element));
		 
		 
}
}
