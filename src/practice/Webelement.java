package practice;

import java.awt.Dimension;
import java.awt.Rectangle;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webelement
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver=new EdgeDriver();
	//driver.get(" https://www.facebook.com/login.php/");
	
//xpath by contains Attribute
//	WebElement font=driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
	//cssvalue (webElement)
//	String data =font.getCssValue("font-size");
	//System.out.println(data);
	
	//WebElement value=driver.findElement(By.xpath("//input[@id='email']"));
	//String data1=value.getCssValue("colour");
//	System.out.println(data1);
	
/*	//getlocation() (webElement)
	 WebElement data=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Point value=data.getLocation();
	System.out.println( value.getX());
	System.out.println( value.getY());
	System.out.println( value);
	
	//getsize()
	 WebElement data1=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	org.openqa.selenium.Dimension value1=data1.getSize();
		System.out.println( value1.getHeight());
		System.out.println( value1.getWidth());
		System.out.println( value1);
		
	
	//get rectangle
	WebElement data2=driver.findElement(By.xpath(" //input[@name='email']"));
	org.openqa.selenium.Rectangle value2= data.getRect();
	System.out.println(value2.getHeight());
	System.out.println(value2.getWidth());
	System.out.println(value2.getX());
	System.out.println(value2.getY());*/
	
	driver.get("https://demo.actitime.com/login.do");
 /*WebElement UN=driver.findElement(By.id("username"));
	UN.sendKeys("admin");
	Thread.sleep(1000);
	//UN.clear();
	
	//isdisplayed()method
	WebElement data=driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	if(data.isDisplayed())
	{
		System.out.println("logo is displayed");
		
	}
	else
	{
		System.out.println("logo is not displayed");
	}*/
	
	//isenabled()method
	WebElement data=driver.findElement(By.id("username"));
	if(data.isEnabled())
		
	{
	data.sendKeys("admin");
	
}
	else
	{
		System.out.println("data is not enabled");
	}
  }
}


