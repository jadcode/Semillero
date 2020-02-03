import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgprueba {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jcastano\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();


		String mensaje = "Perfecto! el registro fue dado de alta correctamente";

		driver.get("https://demo.testfire.net/");	
		driver.manage().window().maximize();



		WebElement nombre = driver.findElement(By.id("txt_name"));
		nombre.sendKeys("Jony Duque"); WebElement usuario =
				driver.findElement(By.id("txt_user")); usuario.sendKeys("Jaduque");


				Select listaPais = new Select (driver.findElement(By.id("cmb_pais")));
				listaPais.selectByValue("Canada");


				try {

					Select listaciudad = new Select (driver.findElement(By.id("cmb_barrio")));
					listaciudad.selectByValue("Alberta"); }

				catch(Exception ex) {
					System.out.println("Se presento un error: "+ex.getMessage()); }


				driver.findElement(By.id("btnsubmit")).click();

				WebElement confirmacion = driver.findElement(By.id("registrationok"));

				if(!confirmacion.getText().contains(mensaje)) {
					System.out.println("No se registro correctamente"); } else {
						System.out.println("Registro correcto"); }
		 
				
		driver.close();
		driver.quit();
	}

}
