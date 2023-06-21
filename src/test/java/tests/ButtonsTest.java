package tests;

import listeners.Testlisteners;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;


public class ButtonsTest extends BaseTest {

    @Test
    public void testTextAfterClick() {
        ButtonsPage page = new ButtonsPage(driver);

        page.clickClickMe();

        Assert.assertEquals(driver.findElement(page.getDynamicMessage()).getText(), "You have done a dynamic click");

    }
}
