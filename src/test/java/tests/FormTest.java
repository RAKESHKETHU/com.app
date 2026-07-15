package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


import bases.BaseClass;
import Pages.FormPage;






public class FormTest extends BaseClass {

    @Test
    public void verifyRegistrationForm() {

        FormPage form = new FormPage(driver);

        form.enterName("RakeshReddyKeth");

        form.enterEmail("rakeshkethu11@gmail.com");

        form.enterPhone("8317666266");

        form.enterAddress("Opposite to LLF, Vedayapalem, Nellore");

        form.selectGender();

        form.selectDays();

        form.selectCountry("India");

        form.selectColor("Red");

        form.selectAnimal("Dog");

        form.selectDate("07/15/2026");

        form.clickSubmit();

        Assert.assertTrue(driver.getTitle().contains("Automation"));
    }
}