package UI.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class FormPage extends BasePage{


    public FormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


//ELEMENTS

    @FindBy(xpath = "//div[contains(@class,'left-pannel')]")
    private WebElement sideBarMenu;

    @FindBy(xpath = "//div[contains(@class,'show')]/descendant-or-self::li[contains(@id,'item-0')]")
    public WebElement buttonForm;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[contains(@placeholder,'Last')]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailField;

    @FindBy(xpath = "//div[contains (@class,'custom-control')]/descendant-or-self::label[@for='gender-radio-1']")
    public WebElement maleButton;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement numField;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    public WebElement sportBox;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    public WebElement readingBox;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    public WebElement musicBox;

    @FindBy(xpath = "//textarea")
    public WebElement adressField;

    @FindBy(xpath = "//div[@id='state']")
    public WebElement stateSelect;

    @FindBy (xpath = "//div[@id='city']")
    public WebElement citySelect;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitButton;

//METHOD

    public boolean isFormPageDisplayed(){
        return isDisplayed(sideBarMenu);
    }

    public void openPracticeForm(){
        click(buttonForm);
    }

    public void enterFirstName (String firstname){
        firstName.sendKeys(firstname);
    }

    public void enterLastName (String lastname){
        lastName.sendKeys(lastname);
    }

    public void enterEmailAddress(String email){
        emailField.sendKeys(email);
    }

    public void chooseGenderButton(){
        click(maleButton);
    }

    public void enterNumberField (String number){
        numField.sendKeys(number);
    }

    public void enterAddressField (String address){
        adressField.sendKeys(address);
    }



}