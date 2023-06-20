package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends AbstractPageObject {
    public ButtonsPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/buttons");
    }

    private final By clickMeElement = new By.ByXPath("(//button[@class='btn btn-primary'])[3]");

    public void getClickMeText(){
        driver.findElement(clickMeElement).getText();
    }

    public void clickClickMe(){
        driver.findElement(clickMeElement).click();
    }

}
