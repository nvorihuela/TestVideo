package pruebas;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import paginas.PaginaInicio;

public class Test_POM extends Test_Padre{
WebDriver driver;
	@Test
public void testPOM() {
		
	PaginaInicio objPaginaInicio = new PaginaInicio(driver);
	objPaginaInicio.sendKeysBuscador("valor prueba");
	objPaginaInicio.clicLogin();

}
}
