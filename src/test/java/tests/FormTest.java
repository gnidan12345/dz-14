package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.WebTables;

import static pageobjects.AbstractPageObject.generateRandomChars;

public class FormTest extends BaseTest {

    private String lastName = generateRandomChars("abcdefghijklmnopqrstuvwxyz", 7);

    @Test

    public void testForm() throws InterruptedException {
        WebTables webTables = new WebTables(driver);
        webTables.clickAddButton();
        webTables.waitTillAppears(webTables.getModalForm());
        webTables.fillForm("Test", lastName, "test@gmail.com", 25, 2500, "DP01");

        Assert.assertEquals(driver.findElement(webTables.getNewRecordAdded()).getText(), "Test");

    }
}
