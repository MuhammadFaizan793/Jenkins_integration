package seleniumpkg;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.time.Duration;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	
	@Test
	public void FirstTest() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.findElement(By.name("q")).sendKeys("CG Technologies", Keys.ENTER);
		// System.out.print(driver.getTitle());
		

	}

}

