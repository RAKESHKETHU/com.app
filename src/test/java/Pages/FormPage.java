package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {

    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    By txtName = By.id("name");
    By txtEmail = By.id("email");
    By txtPhone = By.id("phone");
    By txtAddress = By.id("textarea");

    By male = By.id("male");

    By sunday = By.id("sunday");
    By monday = By.id("monday");

    By country = By.id("country");

    By colors = By.id("colors");

    By animals = By.id("animals");

    By date = By.id("datepicker");

    By submit = By.xpath("//button[text()='Submit']");

    // Methods

    public void enterName(String name) {
        driver.findElement(txtName).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void enterPhone(String phone) {
        driver.findElement(txtPhone).sendKeys(phone);
    }

    public void enterAddress(String address) {
        driver.findElement(txtAddress).sendKeys(address);
    }

    public void selectGender() {
        driver.findElement(male).click();
    }

    public void selectDays() {
        driver.findElement(sunday).click();
        driver.findElement(monday).click();
    }

    public void selectCountry(String value) {
        driver.findElement(country).sendKeys(value);
    }

    public void selectColor(String value) {
        driver.findElement(colors).sendKeys(value);
    }

    public void selectAnimal(String value) {
        driver.findElement(animals).sendKeys(value);
    }

    public void selectDate(String value) {
        driver.findElement(date).sendKeys(value);
    }

    public void clickSubmit() {

        driver.findElement(By.tagName("body")).click();

        driver.findElement(submit).click();

    }
}