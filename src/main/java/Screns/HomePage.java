package Screns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchField() {
       return getElement("//input[@type='text']");
    }

    public WebElement btnGaming() {
        return getElement("//a[@title='Gaming']");
    }

    public WebElement btnWatch() {
        return getElement("//tp-yt-paper-button[@class='style-scope ytd-button-renderer style-white-with-border']");
    }

    public WebElement popUpMessageDismiss() {
        return getElement("//yt-formatted-string[contains(text(),'Dismiss')]");
    }
}
