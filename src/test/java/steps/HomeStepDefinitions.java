package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.*;

public class HomeStepDefinitions {
    private HomePage homePage;


    @Given("I open {}")
    public void openUrl(String url) {
        open(url);
        homePage = page(new HomePage());
    }

    @Given("I verify Yardi page is opened")
    public void pageIsOpen() {
        Assert.assertTrue(homePage.isMenuItemExist("Markets"));
    }

    @Given("Run fail test scenario")
    public void failTest() {
        Assert.assertFalse(true);
    }
}
