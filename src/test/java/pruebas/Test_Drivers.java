package pruebas;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Drivers {
	WebDriver driver;
	
	@Test
	public void driverIE() {
		System.setProperty("webdriver.ie.driver", "..\\TestVideo\\Drivers\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/");
		driver.quit();
	}	

	@Test
	public void driverFirefox() {
		System.setProperty("webdriver.gecko.driver", "..\\TestVideo\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.quit();
	}

	@Test
	public void driverChrome() {
		System.setProperty("webdriver.chrome.driver", "..\\TestVideo\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.quit();
	}

}
