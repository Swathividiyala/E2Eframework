package Login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.BaseClass;
import homePage.LandingPage;

public class ValidateNavigation extends BaseClass {

	@BeforeTest

	public void iniDriver() throws IOException

	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void navigateContacts() throws IOException {
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getContacts().isDisplayed());

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
