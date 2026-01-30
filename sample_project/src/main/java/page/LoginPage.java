package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("button[type='submit']"));
	}
	public void login(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	

}
