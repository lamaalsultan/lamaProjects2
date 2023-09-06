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

public class uiAutomator2 {



	@Test
	public void appiumBasicTest() throws  InterruptedException, MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Settings");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		//cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		Thread.sleep(9000);                          //scroll to "accounts" by using UIAutomator
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Accounts\"))"));
		Thread.sleep(2000);                        //find element by using UIAutomator with text
		MobileElement Accounts=(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("text(\"Accounts\")"));
		Accounts.click();
		Thread.sleep(2000);                       //find element by using UIAutomator with class
		MobileElement element=(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Switch\")"));
		element.click();
		Thread.sleep(3000);                      //find element by using UIAutomator with text contains
		MobileElement elem=(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"OK\")"));
		elem.click();

	}
}
