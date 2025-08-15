package seleniumpkg;

import org.openqa.selenium.WebDriver;

public class Snippet {

    public static void openUrl(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
}
