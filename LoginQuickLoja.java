package login.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestQuick {
	private static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		 driver = new FirefoxDriver();
	}

	@Test
	public void testloginCorreto() {
		driver.get("http://quickloja.qualister.info/");
		driver.findElement(By.xpath(".//*[@id='usuariologin']")).sendKeys("Teste");
	    driver.findElement(By.xpath(".//*[@id='usuariosenha']")).sendKeys("1234");
	    driver.findElement(By.xpath("html/body/div/form/div[3]/div/button")).click();
	    driver.navigate().to("http://quickloja.qualister.info/principal");
	}
	@Test 
	public void testLoginIncorreto(){
		driver.get("http://quickloja.qualister.info/");
		driver.findElement(By.xpath(".//*[@id='usuariologin']")).sendKeys("karla");
	    driver.findElement(By.xpath(".//*[@id='usuariosenha']")).sendKeys("1234");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}
	@Test
	public void testFazerLogoff(){
		driver.get("http://quickloja.qualister.info/");
		driver.findElement(By.xpath(".//*[@id='usuariologin']")).sendKeys("Teste");
	    driver.findElement(By.xpath(".//*[@id='usuariosenha']")).sendKeys("1234");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}


}
