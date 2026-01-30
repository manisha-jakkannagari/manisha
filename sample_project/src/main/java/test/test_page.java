package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import page.googleSearchPage;

public class test_page {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Search_();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	public static void Search_() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		googleSearchPage.Search(driver).click();
		googleSearchPage.Search(driver).sendKeys("hi"+Keys.ENTER);
	}
			}
	

	

