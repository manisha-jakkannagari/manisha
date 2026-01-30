package page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class LoginPageFactory {
	WebDriver driver;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="loginBtn")
	WebElement loginButton;
	//constructor
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void login(String user,String pass ) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	
	

}
