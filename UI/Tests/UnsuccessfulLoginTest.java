package UI.Tests;

import UI.Pages.BookStorePage;
import UI.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnsuccessfulLoginTest extends BaseTest {


    @Test
    public void checkUnsuccessfulLogin(){

        HomePage homePage = new HomePage(driver);
        homePage.openBookStoreCategory();

        BookStorePage bookStorePage = new BookStorePage(driver);
        Assert.assertTrue(bookStorePage.isBookStorePageDisplayed());

        bookStorePage.openLoginForm();
        bookStorePage.enterUserName("Denis");
        bookStorePage.enterPassword("penis");
        bookStorePage.clickLoginButton();
        bookStorePage.isResultMassageCorrect("Invalid username or password!");
    }
}
