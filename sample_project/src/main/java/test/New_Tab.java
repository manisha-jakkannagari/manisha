package test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.LoginPageFactory;
public class New_Tab {
	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.youtube.com");
	}

}
