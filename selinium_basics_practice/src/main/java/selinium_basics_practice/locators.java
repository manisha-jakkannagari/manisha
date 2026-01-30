package selinium_basics_practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class locators {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	
	
}
}
