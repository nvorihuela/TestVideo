package pruebas;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Test_Screenshots {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "..\\TestVideo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void screenshotSelenium() throws IOException {
		TakesScreenshot miScreen = ((TakesScreenshot) driver);
		File DestinoArchivo = new File("..\\TestVideo\\ScreenshotSelenium\\testScreen.png");
		File archivo = miScreen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(archivo, DestinoArchivo);
	}

	@Test
	public void screenshotFullAshot() throws IOException  {
		Screenshot miScreen= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);
		ImageIO.write(miScreen.getImage(), "PNG", new File("..\\TestVideo\\ScreenshotAshot\\testFullScreen.png"));
	}

	@Test
	public void screenshotElementAshot() throws IOException {
		Screenshot miScreen=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, driver.findElement(By.xpath("//*[@id=\"header\"]/a[1]/img[1]")));
		ImageIO.write(miScreen.getImage(), "PNG", new File("..\\TestVideo\\ScreenshotAshot\\testElementScreen.png"));
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
}
