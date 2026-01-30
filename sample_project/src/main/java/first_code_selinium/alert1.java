package first_code_selinium;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alert1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	/*normal alert
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	Alert element=driver.switchTo().alert();
	element.accept()
	element.getText()*/
	
	//conformation alert
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
	}

}
