package seleniumpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"u_0_5_jl\"]")).click();
//		driver.findElement(By.cssSelector("royal-login-button")).click();
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
//		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(100));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'_6lth')]"))).click();
		driver.findElement((By.xpath("//button[contains(@class,'_6lth')]"))).click();

		
	}

}
