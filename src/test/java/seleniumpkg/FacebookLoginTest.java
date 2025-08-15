package seleniumpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

    WebDriver driver;

    @Before
    public void setUp() {
       WebDriver driver =  new ChromeDriver();
        driver = new ChromeDriver();
        Snippet.openUrl(driver, Path.FACEBOOK_URL);
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//button[contains(@class,'_6lth')]")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
