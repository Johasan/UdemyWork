package Screns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage implements Expectations{
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private final int BASIC_TIME = 15;

    public WebElement getElement(String locator) {
        return waitElementToBeClickable(locator);
    }

    public List<WebElement> getElements(String locator) {
        return waitVisibilityOfAllElementsLocatedBy(locator);
    }

    @Override
    public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    @Override
    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}
