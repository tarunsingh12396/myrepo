package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("");

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		WebElement win = driver.findElement(By.xpath(""));
		win.click();

		Set<String> childid = driver.getWindowHandles();

		for (String s : childid) {

			if (!parentid.equals(s)) {

				driver.switchTo().window(s);

				String title = driver.getTitle();
				if (title.equals("")) {

					WebElement nme = driver.findElement(By.xpath(""));
					nme.sendKeys("");
					
					break;

				}

			}

		}
		
		driver.close();

		driver.switchTo().window(parentid);
	WebElement xy=	driver.findElement(By.xpath(""));
	xy.click();
		
		
	}

}
