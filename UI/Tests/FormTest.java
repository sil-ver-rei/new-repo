package UI.Tests;

import UI.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import UI.Pages.FormPage;


public class FormTest extends BaseTest{


    @Test
    public void checkCompleteForm(){

        HomePage homePage = new HomePage(driver);
        homePage.openFormsCategory();

        FormPage formPage = new FormPage(driver);
        Assert.assertTrue(formPage.isFormPageDisplayed());

        formPage.openPracticeForm();
        formPage.enterFirstName("Denis");
        formPage.enterLastName("Penis");
        formPage.enterEmailAddress("sanya@poryadok.com");
        formPage.chooseGenderButton();
        formPage.enterNumberField("1010101010");
        formPage.enterAddressField("str.SkillClan 127");

    }
}
