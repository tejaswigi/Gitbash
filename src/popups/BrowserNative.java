package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNative 
{
	public static void main(String[] args) 
	{
		/*ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.yatra.com");*/
		
		
		/*EdgeOptions options=new EdgeOptions();
           options.addArguments("incognito");
		WebDriver driver=new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.yatra.com");*/
		
		EdgeOptions option=new EdgeOptions();
        option.addArguments("incognito");
		WebDriver driver=new EdgeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.yatra.com");
		
		
	}

}
