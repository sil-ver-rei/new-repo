package UI.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

//ElEMENTS

    public WebElement elementsCategory = findElementByXpath("//h5[contains(text(),'Elements')]/ancestor::div[contains(@class,'mt-4')]");
    public WebElement formsCategory = findElementByXpath("//h5[contains(text(),'Forms')]/ancestor::div[contains(@class,'mt-4')]");
    public WebElement bookStoreCategory = findElementByXpath("//h5[contains(text(),'Book')]/ancestor::div[contains(@class,'mt-4')]");

//METHOD

    public void openElementCategory(){
        click(elementsCategory);
    }

    public void openFormsCategory(){
        click(formsCategory);
    }

    public void openBookStoreCategory(){
        scrollAndClick(bookStoreCategory);
    }
}
