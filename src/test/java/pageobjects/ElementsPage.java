package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ElementsPage extends AbstractPageObject {


    private final By buttonsElement = new By.ByXPath("//*[@id='item-4']");

    private final String URL = "https://demoqa.com/elements";

    private final By menuItems = new By.ByXPath("(//ul)[1]/li");

    private final By clickMeElement = new By.ByXPath("//button[text()='Click Me']");

    private final By leftPannel = new By.ByXPath("//div[@class='left-pannel']");

    public ElementsPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }

    public WebElement getClickMeElement() {
        return getElement(clickMeElement);
    }

    public WebElement getButtonsElement() {
        return getElement(buttonsElement);
    }

    public WebElement getLeftPannel() {
        return getElement(leftPannel);
    }

    public List<WebElement> getMenuItems() {
        return getelements(menuItems);
    }


    public List<String> getMenuItemsText() {
        return getelements(menuItems).stream().map(WebElement::getText).toList();
    }

    public ButtonsPage clickButtons() {
        getElement(buttonsElement, 5).click();
        return new ButtonsPage(driver);
    }

    public void clickOnButtonsMenuElement() {
        scrollToElement(getElement(buttonsElement)).click();
    }

}
