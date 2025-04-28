package UI.Tests;

import UI.Pages.ElementsPage;
import UI.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest{

    @Test
    public void checkSuccessfulCompleteCheckBox()  {

        HomePage homePage = new HomePage(driver);
        homePage.openElementCategory();

        ElementsPage elementsPage = new ElementsPage(driver);
        Assert.assertTrue(elementsPage.isElementsPageDisplayed());

        elementsPage.openElementsSideMenuCategory();
        elementsPage.openCheckBoxMenuCategory();
        elementsPage.choseHomeBox();
        Assert.assertTrue(elementsPage.isResultMassageCorrect("excelFile"));
    }

}
