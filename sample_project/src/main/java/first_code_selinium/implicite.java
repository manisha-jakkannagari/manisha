package first_code_selinium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class implicite {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://www.google.com");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						driver.findElement(By.name("q")).sendKeys("selenium");
						Thread.sleep(3000);
						driver.quit();
						
			}

}
