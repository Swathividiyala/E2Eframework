package Login;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import homePage.LandingPage;
import homePage.SigningPage;
import resources.BaseClass;

public class PageTitle extends BaseClass{
	public WebDriver driver;
	private static Logger log=LogManager.getLogger(PageTitle.class.getName());
	
	@BeforeTest

	public void iniDriver() throws IOException

	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
@Test
public void logintoapp() throws IOException
{
	LandingPage l=new LandingPage(driver);
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURsES");
	log.info("Validated the get text");
	}

@AfterTest
public void teardown()
{
	driver.close();
}
}
