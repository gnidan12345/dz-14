package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.ElementsPage;

import java.util.List;

public class ElementsTest extends BaseTest {


    @Test

    public void testElementsPage() {
        ElementsPage elementsPage = new ElementsPage(driver);
        boolean isDisplayed = elementsPage.getLeftPannel();
        elementsPage.getMenuItems();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");
        Assert.assertTrue(isDisplayed, "The left pannel is not displayed");

    }

    @Test
    public void testMenuItems() {
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.getMenuItems();

        Assert.assertEquals(elementsPage.getMenuItems().size(), 9);
    }

    @Test
    public void testButtons() {
        ElementsPage elementsPage = new ElementsPage(driver);

        elementsPage.scrollToElement(driver.findElement(elementsPage.getButtonsElement()));

        elementsPage.clickButtons();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
        Assert.assertEquals(driver.findElement(elementsPage.getClickMeElement()).getText(), "Click Me");

    }
}