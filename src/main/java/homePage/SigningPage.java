package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigningPage {
	
public WebDriver driver;
	
	public SigningPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

By emai=By.name("email");
By pwd=By.name(" password");
By sig=By.xpath("//input[@value='Log In']");

public WebElement getemail()
{
	return driver.findElement(emai);
}

public WebElement getpassword()
{
	return driver.findElement(pwd);
}
public WebElement getsignin()
{
	return driver.findElement(sig);
}
}
