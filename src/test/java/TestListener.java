import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.logging.LogType;

public class TestListener implements TestWatcher {
    @Override
    public void testSuccessful(ExtensionContext context) {
        Allure.getLifecycle().addAttachment("Test complete", "image/png", "png",
                ((TakesScreenshot) TestConfig.driver).getScreenshotAs(OutputType.BYTES));
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment("Test failing reason", "image/png", "png",
                ((TakesScreenshot) TestConfig.driver).getScreenshotAs(OutputType.BYTES));
        Allure.addAttachment("Logs after test falling",
                String.valueOf(TestConfig.driver.manage().logs().get(LogType.BROWSER)));
    }
}
