package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class appiumTry {
	@Test
public void testCase() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.138.101:5555");
	    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	    cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
	    
	    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    driver.get("https://www.nahdionline.com/en/");
	    Thread.sleep(10000);
	    WebElement search= driver.findElement(By.id("search"));
	    search.click();
	    Thread.sleep(10000);
	    search.clear();
	    search.sendKeys("shampo");//write shampo in search bar
	    
}
}
