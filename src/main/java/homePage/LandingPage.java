package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By login=By.xpath("//span[contains(text(),'Login')]");
	public WebElement signin()
	
	{
		return driver.findElement(login);
	}

}
