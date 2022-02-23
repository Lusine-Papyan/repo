package webdriver_manager;


import com.codeborne.selenide.Configuration;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.TestEnvHelper;

import java.util.ResourceBundle;

@UtilityClass
public class WebDriverManager {

    private DesiredCapabilities capabilities;

    public void configureDriver(WebDriverType webDriver) {
        switch (webDriver) {
            case chrome:

        }

    }

    public void configureRemoteDriver(String platform, String driverType, String remoteUrl) {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, platform);
        Configuration.browserCapabilities=capabilities;
        Configuration.browser=driverType;
        Configuration.remote= remoteUrl;
    }

}
