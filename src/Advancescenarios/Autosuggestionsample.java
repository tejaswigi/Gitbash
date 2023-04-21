package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestionsample 
{
  public static void main(String[] args) throws Throwable
  {

	  WebDriver driver= new EdgeDriver();
	  driver.get("http:www.google.com");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("q")).sendKeys("selinium");
	  
	  Thread.sleep(1000);
	  
	 List <WebElement> list=driver.findElements(By.tagName("li"));
	 
	 for(WebElement wb:list)
	 {
		 System.out.println(wb.getText());
	 
	 
		 if(wb.getText().contains("selenium testing"));
		 {
			 wb.click();
			 break;
		 }
}
  }
}
