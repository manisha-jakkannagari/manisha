package first_code_selinium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class wait_methods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//implicitly wait
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cms-demo\"]/div[1]/div/p")));
	
	driver.get("https://www.opencart.com/index.php?route=cms/demo");
	driver.manage().window().maximize();
	driver.quit();
	
}

}
