package helper;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {

	@Before
	public void Setup() {

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins+*");
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();

		}

	       driver.get(prop.getProperty("url"));
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
		
		
	}
	@After
	public void teardown(Scenario s) {
		if (s.isFailed()) {
			getScreenshot();
			
		}
		
		driver.quit();
		
	}
	
	

}
