package Driver;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import Util.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver_Factory {
	
public static WebDriver dr;
	
	
	
	
	
	public static WebDriver getDriver()
	{
		return dr;
	}
	
	public void setDriver()
	{
		FileReader reader=null;
		String mybrowser;
	
		try {
			reader=new FileReader("/DsAlgoProject/src/test/resources/Config/config.properties");
			
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties property=new Properties();
		/*try {
			property.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	mybrowser =property.getProperty("browser");
	
	if (mybrowser.equalsIgnoreCase("chrome"))
	{
				//System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
				//DesiredCapabilities dc3 = new DesiredCapabilities();
				//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
				
				dr=new ChromeDriver();
				dr.manage().window().maximize();
	}
	else if(mybrowser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\driver\\geckodriver.exe");
		DesiredCapabilities dc3 = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		
		dr=new FirefoxDriver();
		dr.manage().window().maximize();
	}
	else if(mybrowser.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
		DesiredCapabilities dc3 = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		
		dr=new EdgeDriver();
		dr.manage().window().maximize();
	}
	else 
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
		DesiredCapabilities dc3 = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
	
}
			
			
			
			
			
			
		}
		
		
			
			
		}
		
		
		
		
	



	
//	public WebDriver init_driver(String browserName) {
//		
//
//
//
//
//	if(browserName.equals("chrome")) {
//	System.out.print("reached drivefactory");
//	WebDriverManager.chromedriver().setup();
//	tlDriver.set(new ChromeDriver());
//	}
//	else if(browserName.equals("firefox")) {
//	WebDriverManager.firefoxdriver().setup();
//	tlDriver.set(new FirefoxDriver());
//	}
//	else if(browserName.equals("safari")) {
//	//tlDriver.set(new SafariDriver());
//	}
//	else {
//	System.out.println("Please pass correct browser");
//	}
//
//	//getDriver().manage().deleteAllCookies();
//	//getDriver().manage().window().maximize();
//	return getDriver();
//
//	}

//	public static synchronized WebDriver getDriver() {
//	return tlDriver.get();
//
//	}
//	public static void setUpDriver() {
//	if (getDriver()== null) {
//	//LoggerLoad.info("Driver is NULL");
//	//getchromeDriver();
//	//tlDriver.set(new ChromeDriver());
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		
//
//	}


