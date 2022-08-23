package fragments;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {

    private static final By ROOT = By.xpath("//h3[text()='Вхід']/../..");
    private static final By EMAIL_FIELD = By.cssSelector("#auth_email");

    private SelenideElement getRootElement() {
        return $(ROOT);
    }

    public SelenideElement getEmailField() {
        return getRootElement().find(EMAIL_FIELD);
    }

}
