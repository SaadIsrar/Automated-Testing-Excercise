import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Development/web_driver/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void testSeleniumTesting(){
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}