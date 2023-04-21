package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeysClass
{
  public static void main(String[] args)
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().window().maximize();
	  //1st approach
	 // driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	  
	/*  //2nd approach
	  driver.findElement(By.id("username")).sendKeys("admin");
	  WebElement password=driver.findElement(By.name("pwd"));
	  password.sendKeys("manager",Keys.ENTER);*/
	  
	/*//3rd approach
	  driver.findElement(By.id("username")).sendKeys("admin");
	  WebElement password=driver.findElement(By.name("pwd"));
	  password.sendKeys("manager");
	  password.sendKeys(Keys.ENTER);*/
	  
	  //checking checkbox
	  driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE);
	  
}
}
