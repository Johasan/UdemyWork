package Screns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchField() {
       return getElement("//input[@name='search']");
    }

    public List<WebElement> searchResult() {
        return getElements("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted']");
    }
}
