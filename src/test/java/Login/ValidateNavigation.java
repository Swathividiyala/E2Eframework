package Login;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homePage.LandingPage;
import resources.BaseClass;

public class ValidateNavigation extends BaseClass {
	public WebDriver driver;
	private static Logger log=LogManager.getLogger(ValidateNavigation.class.getName());

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
		log.info("Validated the navigationlink");
		log.info("Test is completed");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
