package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Fileuploaded 
{
  public static void main(String[] args) {
	

  
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.foundit.in/rio/login");
	driver.findElement(By.linkText("Upload Resume")).click();
	//WebElement data=driver.findElement(By.xpath("//button[text()=or select file to upload"));
	WebElement data=driver.findElement(By.id("file-upload") );
	data.sendKeys("C:\\Users\\suhas\\Downloads\\tejaswi resume.pdf");
	System.out.println("uploaded successfully");
	
	
	
	
}
}
