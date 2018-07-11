import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationPractise {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Development/web_driver/chromedriver.exe");


         driver = new ChromeDriver();
    }

    @Test
    public void testAutomationPractise(){
        driver.get("http://automationpractice.com/index.php");


    }
}
