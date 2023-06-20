package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.WebTables;

import static pageobjects.AbstractPageObject.generateRandomChars;

public class FormTest  extends BaseTest{

    private String firstName = generateRandomChars("abcdefghijklmnopqrstuvwxyz", 7);

    private String lastName = generateRandomChars("abcdefghijklmnopqrstuvwxyz", 7);

    @Test

    public void testForm() throws InterruptedException {
        WebTables webTables = new WebTables(driver);
        webTables.clickAddButton();
        webTables.waitTillAppears(new By.ByXPath("//div[@id='registration-form-modal']"));
        webTables.fillForm(firstName, lastName, "test@gmail.com", 25, 2500, "DP01" );

        Assert.assertEquals(driver.findElement(new By.ByXPath("(//div[@class='rt-td'])[22]")).getText(), firstName);


    }
}
