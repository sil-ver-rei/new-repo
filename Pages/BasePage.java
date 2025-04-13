package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
        //якщо це використовується тільки раз то перенеси оце в метод клік
    }

    public void click(WebElement element) throws InterruptedException {
//        WebDriver wait = new WebDriver(driver, Duration.ofSeconds(5));
        Thread.sleep(2000);

//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        Thread.sleep(2000);
        element.click();
    }
//    public void click(WebElement element) {
//        wait.until(ExpectedConditions.elementToBeClickable(element));
}