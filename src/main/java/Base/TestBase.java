package Base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import Config.PropertyFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase extends Capabilities {
	public static Logger log = Logger.getLogger(TestBase.class);
	
	public static  Capabilities reader;
	public static  AndroidDriver<AndroidElement> driver;
	
	public TestBase() throws MalformedURLException {
		
		this.driver = reader.Initial();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

}
