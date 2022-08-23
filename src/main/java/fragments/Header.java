package fragments;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    private static final By SEARCH_FIELD = By.cssSelector("[name='search']");

    private SelenideElement getSearchField() {
        return $(SEARCH_FIELD);
    }

    public boolean isSearchFieldVisible() {
        return $(SEARCH_FIELD).isDisplayed();
    }

    public void search(String value) {
//        getSearchField()
        $(SEARCH_FIELD)
                .shouldBe(Condition.visible)
                .sendKeys(value);
        getSearchField().pressEnter();
    }

}
