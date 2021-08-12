package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\Desktop\\Selenium softwares\\RahulShetty\\E2EFramework\\src\\main\\java\\data.properties");
	    prop.load(fis);
	    String BrowserName=prop.getProperty("browser");
	    
	    if(BrowserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
			  driver =new ChromeDriver();
	    }
	    
	    else if(BrowserName.equals("IE"))
	    {
	    	System.setProperty("webdriver.ie.driver",
					"C:\\Users\\User\\Desktop\\Selenium softwares\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	    }
	    
	    else if(BrowserName.equals("firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\User\\Desktop\\Selenium softwares\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    	  driver=new FirefoxDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    return driver;
	}
	
	
}
