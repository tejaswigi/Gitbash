package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Svg
{
 public static void main(String[] args)
 {
	 WebDriver driver= new EdgeDriver();
	  driver.get("http:www.google.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(" //*[name()='svg' and @class='gb_1e']")).click();
}
}
