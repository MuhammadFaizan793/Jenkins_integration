package seleniumpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstjava {

	public static void main(String[] args) {
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.pk/");
//		Expected Title	
//		Online Shopping in Pakistan: Fashion, Electronics & Groceries - Daraz.pk
		String act_title = driver.getTitle();
		
		if (act_title.equals("Online Shopping in Pakistan: Fashion, Electronics & Groceries - Daraz.pk"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test Failed");
			
		}
		
//		driver.close();
		

		
	}

}
