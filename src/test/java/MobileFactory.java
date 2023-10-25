import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileFactory {
    private static EventFiringWebDriver driver;

    public static EventFiringWebDriver getAndroidDriver() {
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new EventFiringWebDriver(
                    new AndroidDriver<AndroidElement>(url, MobileCapabilities.getAndroidCapabilities()));
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        return driver;
    }
}
