import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Development/web_driver/chromedriver.exe");

        driver = new ChromeDriver();
    }
    @Test
    public void testTest1(){
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk");
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("netflix");
        driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).getText();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();

        //*[@id="gsr"].getText()
    }


}
