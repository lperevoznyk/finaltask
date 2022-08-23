package pages.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RozetkaSelenium {

    @FindBy(name = "search")
    public WebElement searchField;

    public RozetkaSelenium(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
