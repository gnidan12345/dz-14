package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends AbstractPageObject {

    private final By clickMeElement = new By.ByXPath("//button[text()='Click Me']");

    private final By dynamicMessage = new By.ByXPath("//*[@id='dynamicClickMessage']");

    public void getClickMeText() {
        driver.findElement(clickMeElement).getText();
    }

    public void clickClickMe() {
        driver.findElement(clickMeElement).click();
    }


    public By getDynamicMessage() {
        return dynamicMessage;
    }

    public ButtonsPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/buttons");
    }


}
