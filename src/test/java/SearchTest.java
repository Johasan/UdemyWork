import Screns.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class SearchTest extends TestInit {

    @Test
    public void rozetkaSearchTest() {
        HomePage homePage = new HomePage(driver);
        driver.navigate().to("https://rozetka.com.ua/");
        homePage.searchField().sendKeys("iPhone");
        pushBtnEnter();
        List<WebElement> resultSearch = homePage.searchResult();
        if(resultSearch.size() > 0) {
            System.out.println("We have a list");
        } else {
            System.out.println("We doesn't have a list");
        }
        for(WebElement element : resultSearch) {
            Assert.assertTrue(element.isDisplayed());
        }
        Assert.assertTrue(resultSearch.size() > 0);

        for(int i =1; i < 4; i++) {
            resultSearch.get(i).click();
        }
    }
}
