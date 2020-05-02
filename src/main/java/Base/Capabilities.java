package Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import Config.PropertyFileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {
	
static	PropertyFileReader getLocation = new PropertyFileReader();
	

public static AndroidDriver<AndroidElement> Initial() throws MalformedURLException {
DesiredCapabilities cap= new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");//Pixel2 is the name of virtual device
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//this sentance is always correct
cap.setCapability(MobileCapabilityType.APP,getLocation.Location());
AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//this sentance is always correct
return driver;

	}

}
