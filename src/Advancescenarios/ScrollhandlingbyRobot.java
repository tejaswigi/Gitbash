package Advancescenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollhandlingbyRobot 
{
  public static void main(String[] args) throws Throwable 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //get URL
	  driver.get("https://www.flipkart.com/");
	  //maximize screen
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  
	  Thread.sleep(1000);
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  
	  
	  Thread.sleep(1000);
	  r.keyPress(KeyEvent.VK_UP);
	  r.keyRelease(KeyEvent.VK_UP);
	  
	  
	  Thread.sleep(1000);
	  r.keyPress(KeyEvent.VK_UP);
	  r.keyRelease(KeyEvent.VK_UP);
	  
	
}
}
