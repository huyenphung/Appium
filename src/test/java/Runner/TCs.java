package Runner;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Actions.HomepageAction;
import Base.Capabilities;
import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TCs extends Capabilities {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver =Initial();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
	driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
	
	}
	
	
	
	

}
