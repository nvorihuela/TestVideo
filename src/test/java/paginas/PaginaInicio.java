package paginas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicio {
	WebDriver driver;

	By btnSign = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

	By inputSearch = By.id("search_query_top");

	public PaginaInicio(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}
	
	public void clicLogin() {
		driver.findElement(btnSign).click();
	}
	
	public void sendKeysBuscador(String valor) {
		driver.findElement(inputSearch).sendKeys(valor);
		
		
	}
}
