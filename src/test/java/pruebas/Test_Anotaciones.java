package pruebas;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_Anotaciones extends Test_Padre{
	

	@Test
	public void A_test1() {
		System.out.println("Anotación: @Test 1");
		super.driver.manage().window().maximize();
	}

	@Ignore
	public void B_test2() {
		System.out.println("Anotación: @Test 2");

	}

	@Test
	public void C_test0() {
		System.out.println("Anotación: @Test 0");

	}

	
}
