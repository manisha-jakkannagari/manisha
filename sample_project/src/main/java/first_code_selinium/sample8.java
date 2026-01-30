package first_code_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
		public class sample8 {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://www.google.com");
						Actions act=new Actions(driver);
						driver.findElement(By.name("q")).sendKeys("hello world");
						act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
						act.keyDown(Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT).perform();
						
						
						Thread.sleep(3000);
						driver.quit();
						
			}
		}