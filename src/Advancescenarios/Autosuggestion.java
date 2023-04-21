package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion 
{
  public static void main(String[] args) throws Throwable
  {
	  WebDriver driver= new EdgeDriver();
	  driver.get("http:www.flipkart.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	  driver.findElement(By.name("q")).sendKeys("bluetooth");
	  
	  Thread.sleep(1000);
	  
	 List <WebElement> alllinks=driver.findElements(By.tagName("//li"));
	 
	 for(WebElement wb:alllinks)
	 {
		 System.out.println(wb.getText());
	 
	 
		 if(wb.getText().contains(" headset boat"));
		 {
			 wb.click();
			 break;
		 }
	 
	
}
  }
}
