package AppHooks;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import Driver.Driver_Factory;
import Util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import io.cucumber.messages.internal.com.google.protobuf.ByteString.Output;


public class Hooks {
	
	private static Driver_Factory driverFactory =new Driver_Factory();
	static boolean firstSession=true;
	
	
	
	@Before
	public void bf()
	{
		if (firstSession)
		{
			
			driverFactory.setDriver();
			
			firstSession=false;
		}
	}
	
	@AfterSuite
	public static void aftAll()
	{
		try {
			try {
				driverFactory.getDriver().quit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	//private DriverFactory driverFactory_obj;
//	private WebDriver driver;
//	/*private ConfigReader configReader_obj;
//	Properties prop;
//
//	@Before(order=0)
//	public void getProperty() {
//	configReader_obj = new ConfigReader();
//	prop= configReader_obj.init_prop();
//	}
//	@Before(order=1)
//	public void launchBrowser() {
//	String browserName= prop.getProperty("browser");
//	driverFactory_obj = new DriverFactory();
//	driver=driverFactory_obj.init_driver(browserName);
//	}*/
//	@Before
//	public static void setUp() {
//
//	Driver_Factory.getDriver();
//	Driver_Factory.setUpDriver();
//	}
//
//	@After
//	public void tearDown(Scenario scenario) {
//	if (scenario.isFailed()) {
//	// take screenshot:
//	String screenshotName = scenario.getName().replaceAll(" ", "_");
//	byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	scenario.attach(sourcePath, "image/png", screenshotName);
//	}
//
//	}
}


	


