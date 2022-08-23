package tests.ui;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.selenium.RozetkaSelenium;

public class SeleniumExample extends BaseClassUiTest{

    @Test
    public void seleniumTest() {
        RozetkaSelenium rozetkaSelenium = new RozetkaSelenium(WebDriverRunner.getWebDriver());
        rozetkaSelenium.searchField.sendKeys("qwerty");
    }
}
