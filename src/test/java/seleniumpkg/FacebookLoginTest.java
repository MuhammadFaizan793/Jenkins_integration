package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        driver.findElement(By.id("email")).sendKeys("testuser");
        driver.findElement(By.id("pass")).sendKeys("password");
        driver.findElement(By.name("login")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
