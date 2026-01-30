package first_code_selinium;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxes {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[1]/label")).click();
	//driver.findElement(By.className("form-check form-check-inline")).click();
	List<WebElement> checkbox=(List<WebElement>) driver.findElement(By.xpath("//input@class='form-check-input' and @type='checkbox'"));
	for(int i=0;i<checkbox.size();i++) {
		checkbox.get(i).click();
	}
	
	}
	

}
