package test;


import org.openqa.selenium.By;
import utils.TestEnvHelper;
import webdriver_manager.WebDriverManager;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test {


    @org.junit.Test
    public void test() {

//        -Dselenide.remote=https://oauth-lusine05papyan-07bfd:71010d1c-46f1-4e28-9164-669d0e957682@ondemand.eu-central-1.saucelabs.com:443/wd/hub

        String remoteUrl = String.format(
                ResourceBundle.getBundle(TestEnvHelper.TEST_ENV).getString("remote.url"),
                System.getProperty("username"), System.getProperty("access_key"));
        WebDriverManager.configureRemoteDriver(
                System.getProperty(System.getProperty("platform")),
                System.getProperty("browser"),
                remoteUrl);

        open("https://www.list.am");
//        $(By.name("user.name")).setValue("johny");
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Wait
    }
}
