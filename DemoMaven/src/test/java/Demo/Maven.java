package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven{

	static WebDriver driver = null;
	Properties prop = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		File file =new File("/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/DemoMaven/demomaven.properties");
		FileInputStream fileinput = null;

		try{
			fileinput = new FileInputStream(file);
		}
		catch
		(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		{
			prop.load(fileinput);
		}

	System.setProperty("WebDriverManager.chromedriver", null);
	driver = new ChromeDriver();
	
	}

	@BeforeTest
	public void setUp() {


		WebDriverManager.chromedriver();
		driver = new ChromeDriver();


	}

	@Test
	public void googleSearch() {


		driver.get(prop.getProperty("URL"));

	}

}
