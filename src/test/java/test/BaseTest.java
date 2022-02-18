package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {


    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.BROWSER_NAME, CHROME);
        caps.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
        Configuration.browserCapabilities=caps;
        WebDriver driver = new RemoteWebDriver(
                new URL("https://oauth-lusine05papyan-07bfd:71010d1c-46f1-4e28-9164-669d0e957682@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), caps);
        driver.get("www.google.com");

        $(By.name("user.name")).setValue("johny");
        $("#submit").click();
        $(".loading_progress").should(disappear); // Waits until element disappears
        $("#username").shouldHave(text("Hello, Johny!")); // Wait
    }
}
