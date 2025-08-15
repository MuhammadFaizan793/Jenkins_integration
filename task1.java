package seleniumpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class task1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
					
		driver.get("https://demo.nopcommerce.com/");
		
		String act_title = driver.getTitle();
		
		if (act_title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Testing pass");
			
		}
		
		else
		{
			System.out.println("Testing Fail");
			
		}

			}

}
