package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ElementsPage;

import java.util.List;

public class ElementsTest extends BaseTest {

//    private final static


    @Test

    public void testElementsPage() {
        ElementsPage elementsPage = new ElementsPage(driver);
        boolean isDisplayed = elementsPage.getLeftPannel();
        elementsPage.getMenuItems();




        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/elements");
        Assert.assertTrue(isDisplayed, "The left pannel is not displayed");

    }

    @Test
    public void testMenuItems(){
        List<WebElement> MenuItems = new ElementsPage(driver)
                .getMenuItems();

        List<String> menuItemsText = MenuItems.stream().map(WebElement::getText).toList();


     Assert.assertEquals(menuItemsText.size(), 9);

    }

    @Test
    public void testButtons() {
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickButtons();



        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
        Assert.assertEquals(driver.findElement(new By.ByXPath("(//button[@class='btn btn-primary'])[3]")).getText(), "Click Me");



    }
}