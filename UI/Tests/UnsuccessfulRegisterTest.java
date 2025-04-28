package UI.Tests;

import UI.Pages.BookStorePage;
import UI.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnsuccessfulRegisterTest extends BaseTest {


    @Test
    public void checkUnsuccessfulRegister(){

        HomePage homePage = new HomePage(driver);
        homePage.openBookStoreCategory();

        BookStorePage bookStorePage = new BookStorePage(driver);
        Assert.assertTrue(bookStorePage.isBookStorePageDisplayed());

        bookStorePage.openLoginForm();
        bookStorePage.openRegisterForm();
        bookStorePage.entryFirstName("Denis");
        bookStorePage.entryLastName("Penis");
        bookStorePage.enterUserName("SKILL_CLAN");
        bookStorePage.enterPassword("BEST");

    }


}
