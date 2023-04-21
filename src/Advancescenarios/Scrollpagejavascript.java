package Advancescenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Scrollpagejavascript
{
   public static void main(String[] args) throws Throwable 
   {
	
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor )driver;
		
		
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollby(0,800)");
			Thread.sleep(2000);
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window,scrollby(0,-800)");
			Thread.sleep(2000);
		}
		
}
}
