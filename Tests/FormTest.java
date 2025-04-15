package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.FormPage;


public class FormTest extends BaseTest{


    @Test
    public void checkCompleteForm() throws InterruptedException {

        FormPage formPage = new FormPage(driver);

        formPage.openFormsButton();

        Assert.assertTrue(formPage.checkFormButton.isDisplayed());

        formPage.openFormButton();

        Assert.assertTrue(formPage.assertThatRegistrationFormIsDisplayed());

        formPage.enterCredentials("Denis","Efremow","efremow@example.com","0500150180","skill clan street");



    }
}
