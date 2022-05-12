import Screns.HomePage;
import org.testng.annotations.Test;



public class SearchTest extends TestInit{

    @Test
    public void googleSearchTest() {
        HomePage homePage = new HomePage(driver);
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
//        assertThat(result, "google", "Title text has been not displayed");

    }
}
