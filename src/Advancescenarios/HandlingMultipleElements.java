package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleElements
{
  public static void main(String[] args)
  {
	  WebDriver driver= new EdgeDriver();
			  driver.get("http:www.flipkart.com");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//button[text()='✕']")).click();
			 List <WebElement> allLinks=driver.findElements(By.xpath("//a"));//370
			  int count=0;//1 //2
			  
			  //foreach loop
			  for(WebElement wb:allLinks)
			  {
				  System.out.println(wb.getText()); // ---1,2,----370
				  count++;
			  }
			  System.out.println("total no of links:" +count);
  }
}
			  
			  
					  
				  
			  
	


