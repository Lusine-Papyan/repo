package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage extends BasePage{

    private ElementsCollection menuItems = $$("ul.cmw-main-nav li a.cmw-nav-has-children");

    public boolean isMenuItemExist(String itemName) {
        return menuItems.find(Condition.have(Condition.text(itemName))).isDisplayed();
    }
}
