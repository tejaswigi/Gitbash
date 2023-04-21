package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Browser 
{
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		System.setProperty("webdriver.http.factroy","jdk-http-client");
		String value="C:\\Users\\suhas\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
		 
		 
				
	}
}


