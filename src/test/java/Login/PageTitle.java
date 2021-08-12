package Login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.BaseClass;
import homePage.LandingPage;
import homePage.SigningPage;

public class PageTitle extends BaseClass{
	
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
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	}

@AfterTest
public void teardown()
{
	driver.close();
}
}
