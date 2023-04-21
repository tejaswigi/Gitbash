package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendarpopup
{
  public static void main(String[] args)
  {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[text()='Departure']"));
	
	//driver.findElement(By.xpath("//div[text()='March 2023']"+"ancestor:://div[@class='DayPicker-Month']/descendant::p[text()='20']\"))")).click();
	
	driver.findElement(By.xpath("//div[text()='March 2023']"));
	driver.findElement(By.cssSelector("[id=\\\"htl_dates\\\"]\")).click();\r\n"
			+ "	driver.findElement(By.xpath(\"(//table[@class='ui-datepicker-calendar'])[1]/descendant::a[text()='22']\")).click();\r\n"
			+ ""));
			
		
			
}
}
