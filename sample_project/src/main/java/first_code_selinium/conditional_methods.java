package first_code_selinium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class conditional_methods {
public static void main(String[] args) throws InterruptedIOException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	//WebElement usrnm=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]/label"));
	//System.out.println("displayed"+usrnm.isDisplayed());
	//WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
	//System.out.println("displayed:"+logo.isDisplayed());
	boolean status=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).isEnabled();
	System.out.println(status);
}
}
