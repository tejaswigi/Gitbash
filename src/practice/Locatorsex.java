package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsex 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement data=driver.findElement(By.name("field-keywords"));
	data.sendKeys("bluetooth earphones");
	data.submit();
	
/*WebElement data=driver.findElement(By.name("field-keywords"));
	data.sendKeys("bluetooth earphones");
	data.click();*/
	
	//Linktext() ex
	//driver.findElement(By.linkText("Amazon miniTV")).click();
	
	//partial Linktext() ex
	driver.findElement(By.partialLinkText("Amazon")).click();
			
	
}
}
