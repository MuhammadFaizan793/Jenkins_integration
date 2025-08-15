package seleniumpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		
//		driver.get("https://demo.nopcommerce.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.print(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
//     ====== Element Actions =======
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
//		Click in checkboxes
		driver.findElement(By.id("chkboxOne")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.findElement(By.id("chkboxTwo")).click();
		
		
//		Click on button
		driver.findElement(By.className("signInBtn")).click();
		
//		==========Wait ===========
		//Implicit wait (5 second wait)
		// Explicit wait ( wait until element found
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("This is locator testing file");
		
	
		
		
		
//		=========Drop downs=======
		
		
		//name locator
/*		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Mac");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("small-searchterms"))).sendKeys("Demo");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mac");*/
		
//		====== Insert data into locators =======
		
	/*	driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");*/
		
				
		

		
		
	}

}

