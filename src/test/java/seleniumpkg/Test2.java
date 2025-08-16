package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class Test2 {

    @Test
    public void GoogleSearchTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("q")).sendKeys("CG Technologies", Keys.ENTER);
        // Assert.assertTrue(driver.getTitle().contains("CG Technologies"), "Title does not contain search term");
        driver.quit();
    }

    @Test
    public void FacebookLoginPageTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Assert.assertTrue(driver.findElement(By.name("login")).isDisplayed(), "Login button not visible");
        driver.quit();
    }

    @Test
    public void YouTubeSearchTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("search_query")).sendKeys("Selenium Automation", Keys.ENTER);
//        Assert.assertTrue(driver.getTitle().contains("Selenium Automation"), "Search did not work as expected");
        driver.quit();
    }
}


