package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UIAutomatorViewer {
	@Test
	public void testCase() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
		    cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
		    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
		    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		    driver.findElement(By.xpath("//rk[@content-desc=\"Timer\"]/android.widget.TextView")).click();//click on timer
		    Thread.sleep(1000);
		    driver.findElement(By.id("com.google.android.deskclock:id/timer_setup_digit_2")).click();//click on number 2 
		    Thread.sleep(9000);
		    driver.findElement(By.id("com.google.android.deskclock:id/timer_setup_digit_5")).click();//click on number 5
		    Thread.sleep(9000);
		    driver.findElement(By.className("android.widget.ImageButton")).click();//click on start button
		    
		    
}
}