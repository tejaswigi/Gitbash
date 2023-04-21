package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authenticationpopup 
{
  public static void main(String[] args)
  {
	WebDriver driver=new EdgeDriver();
	//driver.get("https://the.internet.herokuapp.com/basic_auth");
	//(https://username:password@url);
	driver.get("https://admin:admin@the.internet.herokuapp.com/basic_auth");
}
}
