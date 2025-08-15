package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLoginTestNG {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        Snippet.openUrl(driver, Path.FACEBOOK_URL);
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//button[contains(@class,'_6lth')]")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
