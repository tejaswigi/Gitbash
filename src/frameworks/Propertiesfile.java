package frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Propertiesfile 
{
    public static void main(String[] args) throws Throwable
    {
		WebDriver driver=new EdgeDriver();
		//FileInputStream fis=new FileInputStream("./commondata10.properties.txt");
		FileInputStream fis=new FileInputStream("C:\\Users\\suhas\\Desktop\\commondata10.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String url=pro.getProperty("url");
		//String url=pro.getProperty("url1");
		driver.get(url);
		
				
		/*String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys("USERNAME");
		driver.findElement(By.name("pwd")).sendKeys("PASSWORD");*/
		
		
		
	}
}
