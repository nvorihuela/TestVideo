package pruebas;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FuncionesBasicas {
	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "..\\TestVideo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void smokeTest() {
		WebElement linkDesc = driver.findElement(By.linkText("Downloads"));
		linkDesc.click();

		WebElement inputBusq = driver.findElement(By.name("search"));
		inputBusq.clear();
		inputBusq.sendKeys("Maven");
		inputBusq.sendKeys(Keys.ENTER);

		driver.navigate().refresh();
		driver.navigate().back();

		WebElement txtTitulo = driver.findElement(By.tagName("title"));
		String titulo = txtTitulo.getText();
		System.out.println(titulo);

		WebElement logo = driver.findElement(By.className("headerLink"));
		logo.click();

		WebElement linkDoc = driver.findElement(By.partialLinkText("Docum"));
		linkDoc.click();

		WebElement inputBusqDoc = driver.findElement(By.id("search-by"));
		inputBusqDoc.sendKeys("Java");

		WebElement opGet = driver.findElement(By.cssSelector(
				"#sidebar > div.highlightable.ps-container.ps-theme-default.ps-active-y > ul > li:nth-child(1) > a"));
		opGet.click();

		WebElement linkEdit = driver.findElement(By.xpath("//*[@id=\"top-github-link-text\"]"));
		linkEdit.click();

	}
	
	@After
	public void quit() {
		driver.quit();
	}


}
