package first_code_selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("welcome to home");
		WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(300000);
		WebElement ursnm=driver.findElement(By.id("user-name"));
		ursnm.sendKeys("standard_user");
		driver.quit();
	}

}
