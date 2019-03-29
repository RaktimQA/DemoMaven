package Demo;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 
import io.github.bonigarcia.wdm.WebDriverManager;


public class Maven {

	static WebDriver driver = null;
	@Test

	@BeforeTest
	public void setUpTest() {

		//set driver path
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	
	}

	@Test
	public static void goaptiveAdminLogin() throws InterruptedException {


		//open browser & open url
		driver.get("https://google.com");
		}

	@AfterTest
	public void tearDownTest() {

		//close browser
		driver.close();
		System.out.println("Completed");

	}
}
