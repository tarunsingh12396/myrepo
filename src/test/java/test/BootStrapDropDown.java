package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origin=*");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
	WebElement tu=	driver.findElement(By.xpath("//button[@id=\"menu1\"]"));
	
	tu.click();
	
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li"));
	
		for(WebElement s: list) {
		
		String value =	s.getText();
		
		if (value.equals("JavaScript")) {
			
			s.click();
			
			break;
			
		}
			
			
			
			
		}
		
	
	driver.quit();
		
		
		
		
		
		
		

	}

}
