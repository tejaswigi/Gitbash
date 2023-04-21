package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlings 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=WebDriverManager.edgedriver().create();
		//driver.get(" https://demo.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		Thread.sleep(4000);
		Set<String> set=driver.getWindowHandles();
		for(String string:set)
		{
			driver.switchTo().window(string);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("selenium"));
			{
				break;
			}
		}
			driver.findElement(By.xpath(" //a[text()='Get Tickets']")).click();
			Set<String> windows1=driver.getWindowHandles();
			for(String childwindows:windows1)
			{
				driver.switchTo().window(childwindows);
				String title=driver.getTitle();
				System.out.println(title);
				if(title.contains("Frames&windows"));
				{
					break;
				}
		
			
		}
		
	}

}
