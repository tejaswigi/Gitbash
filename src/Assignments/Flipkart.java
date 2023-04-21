package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import practice.Webelement;

public class Flipkart
{
 

public static void main(String[] args)
 {
	WebDriver driver=new EdgeDriver ();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
WebElement String = driver.findElement(By.name("q"));
String.sendKeys("Bluetooth Headset");
String.sendKeys(Keys.ENTER);
WebElement Firstproductprce=driver.findElement(By.cssSelector("div[class='_30jeq3']"));


System.out.println("price of firstproduct is:"+ Firstproductprce .getText());

}
}