package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestEnvHelper;
import webdriver_manager.WebDriverManager;

import java.util.ResourceBundle;

public class Hooks {

    private String remoteURL;

    @Before
    public void init(){
        remoteURL = String.format(
                ResourceBundle.getBundle(TestEnvHelper.TEST_ENV).getString("remote.url"),
                System.getProperty("username"), System.getProperty("access_key"));

        WebDriverManager.configureRemoteDriver(
                System.getProperty(System.getProperty("platform")),
                System.getProperty("browser"),
                remoteURL);
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}