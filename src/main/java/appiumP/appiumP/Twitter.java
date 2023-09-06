package appiumP.appiumP;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Twitter {
	//
	ExtentReports extentt;
	ExtentHtmlReporter htmlReporter;

	//
	@BeforeSuite
	public void reportSetup() {
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extentt = new ExtentReports();
		extentt.attachReporter(htmlReporter);
	}
	@AfterSuite
	public void reportTeardown() {
		// calling flush writes everything to the log file
		extentt.flush();
	}
	@Test
	public void testCase() throws MalformedURLException, InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//cap.setCapability(MobileCapabilityType.VERSION, "11");
		cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.get("https://www.instagram.com/");
		Thread.sleep(10000);
		//
		ExtentTest test = extentt.createTest("MyFirstTest", "Sample description");

		WebElement click= driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div/div/div[2]/div[3]/button[1]"));
		click.click();
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div/div/div[2]/form/div[1]/div[3]/div/label/input"));
		email.sendKeys("ohla.8i");
		Thread.sleep(2000);
		WebElement pass= driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div/div/div[2]/form/div[1]/div[4]/div/label/input"));
		pass.sendKeys("ohlaqa");
		Thread.sleep(9000);
		WebElement login= driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div/div/div[2]/form/div[1]/div[6]/button/div"));
		login.click();





	}
}