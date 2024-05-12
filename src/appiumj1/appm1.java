package appiumj1;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

	    // Set up desired capabilities
	    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12 SKQ1.211019.001");
	    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO M2 Pro");
	    desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.miui.calculator");
	    desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.miui.calculator.cal.CalculatorActivity - Calculator");
	   // desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

	    // Initialize the driver
	    AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

	    // Add your test steps here
	    try {
	        // Example steps:
	        // Find an element by its ID and click on it
	        MobileElement element = driver.findElementById("element_id");
	        element.click();

	        // Wait for some time
	        Thread.sleep(2000);

	        // Perform some action like typing into a text field
	        MobileElement textField = driver.findElementById("text_field_id");
	        textField.sendKeys("Hello, Appium!");

	        // Close the keyboard
	        driver.hideKeyboard();

	        // Wait for some time
	        Thread.sleep(2000);

	        // Perform some other actions...
	    } finally {
	        // Close the session
	        driver.quit();
	    }


	}

}
