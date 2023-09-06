package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TouchActions {
	@Test
	public void testCase() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.138.102:5555");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Calculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		//cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		TouchAction action = new TouchAction(driver)
				.longPress(PointOption.point(972,450))//long press on massage  
				.waitAction()
				.release()
				.perform();	



		// Thread.sleep(2000);        //click on "got it " in popup massage
		// driver.findElement(By.id("com.google.android.apps.messaging:id/federated_learning_popup_positive_button")).click();
		//  Thread.sleep(2000); 

		// 
		//open massage by using tap
		//  action.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByClassName("android.widget.TextView")))) 
		//  .perform();

		// action.waitAction();
		//click on archive	button



	}
}

