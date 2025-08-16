// package seleniumpkg;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;

// public class FacebookLoginTest {

//     WebDriver driver;

//     @BeforeMethod
//     public void setUp() {
//         ChromeDriver driver = new ChromeDriver();
//         driver.get("https://facebook.com");
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//     }

//     @Test
//     public void testLogin() {
//         driver.findElement(By.id("email")).sendKeys("test@gmail.com");
//         driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
//         driver.findElement(By.xpath("//button[contains(@class,'_6lth')]")).click();
//     }

//     @AfterMethod
//     public void tearDown() {
//         if (driver != null) {
//             driver.quit();
//         }
//     }
// }


