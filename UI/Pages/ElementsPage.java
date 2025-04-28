package UI.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//ELEMENTS

    @FindBy(xpath = "//div[contains(@class,'left-pannel')]")
    private WebElement sideBarMenu;

    @FindBy(xpath = "//div[contains(@class,'show')]/descendant-or-self::li[contains(@id,'item-1')]")
    private WebElement sideBarMenuCheckBox;

    @FindBy(xpath = "//label[@for='tree-node-home']")
    private WebElement homeBox;

    @FindBy(xpath = "//button[contains(@class,'rct-option-expand-all')]")
    private WebElement plusButton;

    @FindBy(xpath = "//div[@id='result']")
    private WebElement resultMassage;

    @FindBy(xpath = "//div[contains(text(), 'Elements')]")
    private WebElement elementsSideMenuCategory;

    @FindBy(id = "item-1")
    private WebElement checkBoxMenuCategory;

//METHOD

    public boolean isElementsPageDisplayed(){
        return isDisplayed(sideBarMenu);
    }

    public void openElementsSideMenuCategory() {
       click(elementsSideMenuCategory);
    }

    public void choseHomeBox(){
        click(homeBox);
    }

    public void openCheckBoxMenuCategory() {
        click(checkBoxMenuCategory);
    }

    public boolean isResultMassageCorrect(String resultMassageText){
        return resultMassage.getText().contains(resultMassageText);
    }
}