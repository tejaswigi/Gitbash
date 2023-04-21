package basicselinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser
{
	public static void main(String[] args) throws Throwable 
	{
		//WebDriver driver= new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		//get browser
		//driver.get("http:www.flipkart.com/");
		driver.get(" http:www.amazon.com/");
	Thread.sleep(1000);
	//maximize screen
	driver.manage().window().maximize();
	//minimize screen
driver.manage().window().minimize();
		//get title of webpage
		String data= driver.getTitle();
		System.out.println(data);
		
		//print current url of the application
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//prints sourcecode of the page
		String source=driver.getPageSource();
		System.out.println(source);
		
		//close method closes the current focusing window
		//driver.close();
		
		//closes all the windows
		driver.quit();
		
	} 
	

}
//1st pull
//1st push
