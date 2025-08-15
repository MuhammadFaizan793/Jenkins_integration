package seleniumpkg;

import org.testng.annotations.BeforeSuite;

public class BeforeAll {

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("===== Test Suite Started =====");
    }
}
