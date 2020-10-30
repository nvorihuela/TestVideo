package pruebas;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test_Esperas {
WebDriver driver;
WebDriverWait espera;
	@Test
public void test() {
	System.setProperty("webdriver.chrome.driver","..\\TestVideo\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	espera=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement textArea = espera.until(ExpectedConditions.presenceOfElementLocated(By.id("search_query_top")));
	textArea.sendKeys("valor");
	driver.quit();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
}
