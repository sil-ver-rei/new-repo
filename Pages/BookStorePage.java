package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BasePage {

    //HOME
    @FindBy(xpath = "//h5[text()='Book Store Application']")
    public WebElement storeButton;

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
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement reCaptcha;
    @FindBy(xpath = "//button[@id='register']")
    public WebElement registerButton;
    @FindBy(xpath = "//p[@class='mb-1']")
    public WebElement wrongRegister;
    @FindBy(xpath = "//p[text()='Invalid username or password!']")
    public WebElement wrongLogin;


    //BOOK STORE
    @FindBy(xpath = "//span[text()='Book Store']")
    public WebElement entryBook;

    //PROFILE
    @FindBy(xpath = "//span[text()='Profile']")
    public WebElement entryProfile;

    //B.S.API
    @FindBy(xpath = "//span[text()='Book Store API']")
    public WebElement entryAPI;

    public BookStorePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
