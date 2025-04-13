package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class FormPage extends BasePage{


    public FormPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h5")
    public WebElement registrForm;

    @FindBy(xpath = "//*[text()='Forms']")
    public WebElement formSButton;

    @FindBy(xpath = "//div[@class='element-list collapse show']")
    public WebElement checkFormButton;

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement formButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailField;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement maleButton;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement numField;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement calendarField;

    @FindBy(xpath = "//div[@class='css-1g6gooi']")
    public WebElement subjectField;

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

    @FindBy(xpath = "//button[@id=\"submit\"]")
    public WebElement submitButton;


    public void openFormsButton() throws InterruptedException {
        click(formSButton);
    }

    public void openFormButton() throws InterruptedException {
        click(formButton);
    }

    public void checkBox() throws InterruptedException {
        click(sportBox);
        click(musicBox);
        click(readingBox);
    }

    public void enterCredentials(String firstname, String lastname, String email, String number, String adress) throws InterruptedException {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        emailField.sendKeys(email);
        maleButton.click();
        numField.sendKeys(number);
        checkBox();
        adressField.sendKeys(adress);
    }

    public boolean assertThatRegistrationFormIsDisplayed(){
        return registrForm.isDisplayed();
    }



}