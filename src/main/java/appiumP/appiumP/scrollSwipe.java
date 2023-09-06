package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;

public class scrollSwipe {
	@Test
	public void testCase() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Settings");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		//cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		Thread.sleep(9000);        //click on "got it " in popup massage
		driver.findElement(By.id("com.google.android.apps.messaging:id/federated_learning_popup_positive_button")).click();
		Thread.sleep(9000);                          //scroll to "lama message"
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lama\"))"));

		TouchAction swipe = new TouchAction(driver)
				.press(PointOption.point(972,450))//swipe message to archive 
				.waitAction()
				.moveTo(PointOption.point(108,450))
				.release()
				.perform();


	}
}
