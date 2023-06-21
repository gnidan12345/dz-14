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

    public By getClickMeElement() {
        return clickMeElement;
    }

    public By getButtonsElement() {
        return buttonsElement;
    }

    public boolean getLeftPannel() {
        return getElement(leftPannel).isDisplayed();
    }

    public List<WebElement> getMenuItems() {
        return getelements(menuItems);
    }

    List<WebElement> MenuItems = new ArrayList<>();

    List<String> menuItemsText = MenuItems.stream().map(WebElement::getText).toList();

    public List<String> getMenuItemsText() {
        return menuItemsText;
    }

    public ButtonsPage clickButtons() {
        getElement(buttonsElement, 5).click();
        return new ButtonsPage(driver);
    }

}
