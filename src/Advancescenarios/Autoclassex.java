package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoclassex 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("puma");
	//WebElement data=driver.findElement(By.xpath(""));
}
}
