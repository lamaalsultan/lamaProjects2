package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class context {
	@Test
	public void testCase() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
		    //cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
		    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
		    //cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
		
		    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		    driver.rotate(ScreenOrientation.LANDSCAPE);//change the orientation of screen 
		    
		    
		    
		   
}}
