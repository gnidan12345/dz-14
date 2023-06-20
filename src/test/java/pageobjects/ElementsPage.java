package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

public class ElementsPage extends AbstractPageObject {


    private final By buttonsElement = new By.ByXPath("(//span[@class='text'])[5]");

    private final String URL = "https://demoqa.com/elements";

    private final By menuItems = new By.ByXPath("(//ul)[1]/li");



    private final By leftPannel = new By.ByXPath("//div[@class='left-pannel']");
    public ElementsPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }


    public boolean getLeftPannel (){
        return getElement(leftPannel).isDisplayed();
    }

    public List<WebElement> getMenuItems(){
        return getelements(menuItems);
    }


   public ButtonsPage clickButtons(){
        getElement(buttonsElement, 5).click();
        return new ButtonsPage(driver);
   }

}
