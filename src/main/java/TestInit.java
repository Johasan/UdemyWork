import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class TestInit {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        File file = new File("src/test/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void pushBtnEnter() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER);
        action.perform();
    }

}
