package test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.LoginPageFactory;




public class TestPageFactory {
	static WebDriver driver;
	static LoginPage login;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/login");
		login =new LoginPage();
		login.login("admin","admin123");
		
}
}