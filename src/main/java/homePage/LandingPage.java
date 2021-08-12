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
	By Title=By.xpath("//div/h2[contains(text(),'Featured Courses')]");
	By contacts=By.xpath("//a[contains(text(),'Contact')]");
	public WebElement signin()
	
	{
		return driver.findElement(login);
	}
public WebElement getTitle()
	
	{
		return driver.findElement(Title);
	}

public WebElement getContacts()

{
	return driver.findElement(contacts);
}

}
