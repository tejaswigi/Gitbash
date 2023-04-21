package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclassex 
{
  public static void main(String[] args) throws Throwable 
  {
	WebDriver driver= new EdgeDriver ();
	driver.get("https://www.gmail.com/");
	driver.findElement(By.xpath("//a[text()='Create account']")).click();
	Thread.sleep(1000);
	
	//selectByIndex
	WebElement daylist=driver.findElement(By.id("day"));
	Thread.sleep(1000);
	Select sel=new Select(daylist);
	sel.selectByIndex(20);
	
	//selectbyvalue
	WebElement monthlist=driver.findElement(By.id("month-label"));
	Thread.sleep(1000);
	Select sele=new Select(monthlist);
	sele.selectByValue("9");
	
	//selectbyvisibletext
		WebElement yearlist=driver.findElement(By.id("year"));
		Thread.sleep(1000);
		Select selec=new Select(yearlist);
		selec.selectByValue("2018");
		
		
	
}
}
