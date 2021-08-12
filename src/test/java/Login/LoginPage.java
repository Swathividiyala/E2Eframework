package Login;

import java.io.IOException;

import org.testng.annotations.DataProvider;
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
	
	ap.signin().click();
}

@Test(dataProvider="getdata", priority=2)
public void getemailpwd(String username, String password)
{
	SigningPage ap1=new SigningPage(driver);
			ap1.getemail().sendKeys(username);
			ap1.getpassword().sendKeys(password);
			ap1.getsignin().click();
}
@DataProvider

public Object[][] getdata() throws InterruptedException
{
	Object[][] data=new Object[2][2];
	Thread.sleep(3000);
	data[0][0]="vidiyala@gmail.com";
	data[0][1]="manasa";
	Thread.sleep(3000);
	data[1][0]="vidiyala@gail.com";
	data[1][1]="vidiyala";
	return data;
	
}

}
