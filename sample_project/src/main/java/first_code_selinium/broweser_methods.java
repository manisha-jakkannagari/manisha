package first_code_selinium;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class broweser_methods {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
	
	}
}
