package pruebas;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_DropAsserts {
	WebDriver driver;

	@Before
	public void setUp() {
		/*
		System.setProperty("webdriver.chrome.driver", "..\\TestVideo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
*/
	}

	@Test
	public void testFacebook() {
		try {
	
	
	
		
	
			Assert.assertTrue(false);
			
		
		
		//}catch(Throwable e){System.out.println("exc:" + e);}
		
		} catch (AssertionError  e) {
		System.out.println("exc:" + e);
	}
	}

	@After
	public void quit() {
		//driver.quit();
	}
}
