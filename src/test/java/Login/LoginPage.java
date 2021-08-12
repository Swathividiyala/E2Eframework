package Login;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.BaseClass;
import homePage.LandingPage;
import homePage.SigningPage;

public class LoginPage extends BaseClass{
	
@Test(priority=0)
public void logintoapp() throws IOException
{
	driver=initializeDriver();
	driver.get("http://qaclickacademy.com");
    /*LandingPage ap=new LandingPage(driver);
	
	ap.signin().click();;*/
}
@Test(priority=1)
public void signtoapp()
{
	LandingPage ap=new LandingPage(driver);
	
	ap.signin().click();;
}
@Test(priority=2)
public void getemailpwd()
{
	SigningPage ap=new SigningPage(driver);
			ap.getemail().sendKeys("swathi");
			ap.getpassword().sendKeys("vidiyala");
			ap.getsignin().click();
}
}
