package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

    @FindBy(xpath = "//button[@class='rct-option rct-option-expand-all']")
    public WebElement plusButton;

    @FindBy(xpath = "//button[@class='rct-option rct-option-collapse-all']")
    public WebElement minusButton;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement homeBox;

    @FindBy(xpath = "//div[@id='result']")
    public WebElement checkResult;

    public void openBoxPage() throws InterruptedException {
        Thread.sleep(5000);
        click(elementsEntry);
        Thread.sleep(5000);
        click(checkBoxEntry);
        Thread.sleep(5000);
        Assert.assertTrue(textLogoCheck.isDisplayed());
    }

    public void chooseCheckBox() throws InterruptedException {
        Thread.sleep(5000);
        click(plusButton);
        Thread.sleep(5000);
        click(homeBox);
        Thread.sleep(5000);
        Assert.assertTrue(checkResult.isDisplayed());
    }


}