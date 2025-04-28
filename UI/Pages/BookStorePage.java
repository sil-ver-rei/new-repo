package UI.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BookStorePage extends BasePage {

    public BookStorePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

//ELEMENTS

    @FindBy(xpath = "//div[contains(@class,'left-pannel')]")
    private WebElement sideBarMenu;

    //LOGIN
    @FindBy(xpath = "//span[text()='Login']")
    public WebElement entryLogin;
    @FindBy(xpath = "//button[@id='login']")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@id='newUser']")
    public WebElement newUserButton;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElement userField;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passField;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameField;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameField;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement reCaptcha;
    @FindBy(xpath = "//button[@id='register']")
    public WebElement registerButton;
    @FindBy(xpath = "//p[@class='mb-1']")
    public WebElement wrongRegister;
    @FindBy(xpath = "//p[text()='Invalid username or password!']")
    public WebElement wrongLogin;
    @FindBy(xpath = "//p[@class='mb-1']")
    public WebElement resultMassage;



    //BOOK STORE
    @FindBy(xpath = "//span[text()='Book Store']")
    public WebElement entryBook;

    //PROFILE
    @FindBy(xpath = "//span[text()='Profile']")
    public WebElement entryProfile;

    //B.S.API
    @FindBy(xpath = "//span[text()='Book Store API']")
    public WebElement entryAPI;

//METHOD

    //LOGIN
    public boolean isBookStorePageDisplayed(){
        return isDisplayed(sideBarMenu);
    }

    public void openLoginForm(){
        scrollAndClick(entryLogin);
    }

    public void enterUserName(String username){
        userField.sendKeys(username);
    }

    public void enterPassword(String password){
        passField.sendKeys(password);
    }

    public void clickLoginButton(){
        click(loginButton);
    }

    public boolean isResultMassageCorrect(String resultMassageText){
        wait.until(ExpectedConditions.visibilityOf(resultMassage));
        return resultMassage.getText().contains(resultMassageText);
    }

    public void openRegisterForm(){
        click(newUserButton);
    }

    public void entryFirstName(String firstname){
        firstNameField.sendKeys(firstname);
    }

    public void entryLastName(String lastname){
        lastNameField.sendKeys(lastname);
    }

}
