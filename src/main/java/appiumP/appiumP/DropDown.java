package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DropDown {
	@Test
public void testCase() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	    cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
	    
	    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    driver.get("https://www.nahdionline.com/en/");
	    Thread.sleep(2000);
	    driver.findElementByClassName("action nav-toggle").click();
	    
	   // WebElement search= driver.findElement(By.className("action nav-toggle"));
	   // search.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}}
