package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
	//xpath by attribute
		//htmltag[@Attributename='Attribute value']
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//xpath by VisibleText
		//htmltag[text()='Attributevaue']
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		//xpath by contains Attribute
		//htmltag[contains(@AttributeName,'Attribute value')]
		//driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");
		//driver.findElement(By.xpath("//td[contains(@id,'loginButton')]")).click();
		
		//xpath by  visibletext
		//driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		
		//xpath by contains visible text
		//htmltag[contains(text(),'Attributevalue')]
	//	driver.findElement(By.xpath(" //a[contains(text(),'Vie')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'App')]")).click();
		
		//multiple attributes in a single xpath using AND,OR operator
	driver.findElement(By.xpath("//input[@id=\"username\" and @class=\"textField\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\" or @name=\"pwd\"]")).sendKeys("manager");
		
		//text() function with multiple attributes
	//	driver.findElement(By.xpath("//a[text()='View Time-Track' and @class='item']")).click();
		
		
		
	}

}
