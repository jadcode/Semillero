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

public class PruebaTestFire {

	@Test
	public void test() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\jcastano\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();		
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches",Arrays.asList("ignore-certificate-errors"));	    
	    WebDriver driver = new ChromeDriver(options);	
		driver.get("https://demo.testfire.net/");	
		driver.manage().window().maximize();		
		driver.close();
		driver.quit();
	}

}
