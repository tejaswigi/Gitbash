package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 
{
	  public static void main(String[] args)
	  {
		WebDriver driver=new ChromeDriver();
		driver.get(" www.facebook.com/login/");
		
		//xpath by contains Attribute
		WebElement font=driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
		
		//cssvalue (webElement)
		String data =font.getCssValue("font-size");
		System.out.println(data);
}
}
