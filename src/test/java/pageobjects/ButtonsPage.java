package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage extends AbstractPageObject {

    private final By clickMeElement = new By.ByXPath("//button[text()='Click Me']");

    private final By dynamicMessage = new By.ByXPath("//*[@id='dynamicClickMessage']");

    public void getClickMeText() {
        getElement(clickMeElement).getText();
    }

    public void clickClickMe() {
        getElement(clickMeElement).click();
    }

    public WebElement getDynamicMessage() {
        return getElement(dynamicMessage);
    }

    public ButtonsPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/buttons");
    }
}
