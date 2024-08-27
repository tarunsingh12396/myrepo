package page;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import helper.Base;
import helper.Hooks;


public class LoginPage extends Hooks {
	
	
	
	
	
	
	public void user_launch_the_url() {
		Setup();
		
		
	    
	}

	
	public void user_enter_correct_username_and_correct_password(String usename,String pass) {
		
	WebElement username=	driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	username.sendKeys(usename);
	
	WebElement password=	driver.findElement(By.xpath("//input[@id=\"password\"]"));
	password.sendKeys(pass);
	  
	}

	
	public void user_enter_on_login_button() {
		
		WebElement login=	driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();
	   
	}

	
	public boolean validate_user_navigate_to_home() {
	return driver.findElement(By.xpath("//div[@class=\"product_label\"]")).isDisplayed();
	   
	}

	
	

}
