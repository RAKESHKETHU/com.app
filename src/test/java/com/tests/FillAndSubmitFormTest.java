package com.tests;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FillAndSubmitFormTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @Test
    public void fillAndSubmitForm() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        nameField.sendKeys("Selenium");
        WebElement searchButton = driver.findElement(By.className("wikipedia-search-button"));
        searchButton.click();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.xpath("//div[contains(@class, 'wikipedia-search-results')]"));
        Assert.assertTrue(result.isDisplayed(), "Search results are not displayed!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}