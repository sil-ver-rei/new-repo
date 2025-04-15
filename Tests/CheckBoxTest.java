package Tests;

import Pages.ElementsPage;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest{

    @Test
    public void checkSuccessfulCompleteCheckBox() throws InterruptedException {

        ElementsPage elementsPage = new ElementsPage(driver);

        elementsPage.openBoxPage();

        elementsPage.chooseCheckBox();

    }

}
