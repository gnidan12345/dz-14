package tests;

import listeners.Testlisteners;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;


//@Listeners(Testlisteners.class)
public class ButtonsTest extends BaseTest {
//    ButtonsPage page = new ButtonsPage(driver);


    @Test
    public void testTextAfterClick (){
        ButtonsPage page = new ButtonsPage(driver);

        page.clickClickMe();

        Assert.assertEquals(driver.findElement(new By.ByXPath("//p[contains(text(), 'You have done a dynamic click')]")).getText(), "You have done a dynamic click");
    }
}
