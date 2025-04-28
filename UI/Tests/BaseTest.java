package UI.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    public WebDriver driver;



//    public void selectByValue() {
//        WebElement selectElement = driver.findElement(By.xpath(""));
//        Select select = new Select(selectElement);
//    }



    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @AfterTest
    public void tearDown(){
        if (driver!= null){
            driver.quit();
        }
    }
}

