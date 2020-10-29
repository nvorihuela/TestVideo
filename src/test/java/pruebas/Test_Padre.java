package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Padre {
static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Anotación: @BeforeClass");
		System.setProperty("webdriver.chrome.driver", "..\\TestVideo\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}

	@Before
	public void before() {
		System.out.println("Anotación: @Before");
		driver.get("http://automationpractice.com/index.php");
	}
	
	@After
	public void after() {
		System.out.println("Anotación: @After");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Anotación: @AfterClass");
		driver.quit();

	}
}
