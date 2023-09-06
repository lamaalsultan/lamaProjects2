package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class server {
	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
	    ////////////////cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
	    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
	    //cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
	    
	    AppiumServiceBuilder builder = new AppiumServiceBuilder();
	    builder.withIPAddress("127.0.0.1");
	    builder.usingPort(4723);
	    builder.withCapabilities(cap);
	    builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
	    builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
	    
	    AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
	    service.start();
	    try {
	    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    Thread.sleep(25000);
	    driver.quit();
	    }
	    catch(Exception e){
	    	
	    }
	    service.stop();
	}

}