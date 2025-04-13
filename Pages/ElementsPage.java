package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Elements']")
    public WebElement elementsEntry;

    //CHECK BOX
    @FindBy(xpath = "//li[@class='btn btn-light active']")
    public WebElement checkBoxEntry;

    @FindBy(xpath = "//h1[@class='text-center']")
    public WebElement textLogoCheck;


}