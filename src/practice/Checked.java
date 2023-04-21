package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Checked 
{
 public static void main(String[] args) throws Throwable 
 {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	//is selected()
/*WebElement checkbox=driver.findElement(By.xpath("//label[text()='Keep me logged in']"));
checkbox.click();
Thread.sleep(1000);
if(checkbox.isSelected())
{
	System.out.println("checked");
}
else
{
	System.out.println("unchecked");
}*/

/*//get Attribute()
WebElement data=driver.findElement(By.id("username"));
String value=data.getAttribute("id");
System.out.println("Attribute value for id is:" +value);

String value1=data.getAttribute("type");
System.out.println("Attribute value for type is:" +value1);

WebElement data1=driver.findElement(By.id("loginButton"));
String value2=data1.getAttribute("href");
System.out.println("Attribute value for href is:" +value2);

//output is null value
String value3=data1.getAttribute("name");
System.out.println("Attribute value for name is:" +value3);*/


//get Tag name
/*WebElement data=driver.findElement(By.id("username"));
String value=data.getTagName();
System.out.println("Tagname for username is:"+value);

WebElement data1=driver.findElement(By.id("loginButton"));
String value1=data1.getTagName();
System.out.println("Tagname for username is:"+value1);*/

//getArialRole
WebElement user=driver.findElement(By.id("username"));
System.out.println(user.getAriaRole());

WebElement name=driver.findElement(By.id("pwd"));
System.out.println(name.getAriaRole());

WebElement login=driver.findElement(By.id("loginButton"));
System.out.println(login.getAriaRole());

WebElement check=driver.findElement(By.id("checkbox"));
System.out.println(check.getAriaRole());








		





}
}
