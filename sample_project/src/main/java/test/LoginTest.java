package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;
public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		LoginPage.username(driver).sendKeys("manisha");
		LoginPage.password(driver).sendKeys("manisha");
		LoginPage.loginButton(driver).click();
		driver.quit();
		
	}

}
