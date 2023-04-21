package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionAmazon 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
	
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("bluetooth");
		 Thread.sleep(3000);
		List <WebElement>suggestions=(List<WebElement>) driver.findElement(By.id("container"+ "/child::div"));
		
		 for(WebElement wb:suggestions)
		 {
			 System.out.println(wb.getText());
		 
		 
			 if(wb.getText().contains("earphone"));
			 {
				 wb.click();
				 break;
			 }
	}

}
}
