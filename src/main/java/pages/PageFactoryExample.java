package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryExample {

    @FindBy(css = "[name='search']")
    private WebElement searchField;

}
