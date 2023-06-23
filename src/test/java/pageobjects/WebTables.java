package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables extends AbstractPageObject {

    public WebTables(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");

    }

    private final By buttonAddElement = new By.ByXPath("//button[@id='addNewRecordButton']");
    private final By formHeader = new By.ByXPath("//div[@id='registration-form-modal']");
    private final By firstNameField = new By.ByXPath("//input[@id='firstName']");
    private final By lastNameField = new By.ByXPath("//input[@id='lastName']");
    private final By userEmailField = new By.ByXPath("//input[@id='userEmail']");
    private final By userAge = new By.ByXPath("//input[@id='age']");
    private final By salaryField = new By.ByXPath("//input[@id='salary']");
    private final By departmentField = new By.ByXPath("//input[@id='department']");
    private final By submitButton = new By.ByXPath("//button[@id='submit']");
    private final By modalForm = new By.ByXPath("//div[@id='registration-form-modal']");
    private final By newRecordAdded = new By.ByXPath("//div[text()='Test']");

    public WebElement getNewRecordAdded() {
        return getElement(newRecordAdded);
    }

    public WebElement getModalForm() {
        return getElement(modalForm);
    }

    public void clickAddButton() {
        getElement(buttonAddElement).click();

    }

    public void fillForm(String firstName, String lastName, String email, int age, int salary, String department) {

        getElement(firstNameField).sendKeys(firstName);
        getElement(lastNameField).sendKeys(lastName);
        getElement(userEmailField).sendKeys(email);
        getElement(userAge).sendKeys(String.valueOf(age));
        getElement(salaryField).sendKeys(String.valueOf(salary));
        getElement(departmentField).sendKeys(department, Keys.RETURN);

    }

}
