package first_code_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class sample_7 {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						//driver.get("https://demo.guru99.com/test/radio.html");
					 	driver.get("https://www.saucedemo.com");
						Thread.sleep(3000);
						WebElement username=driver.findElement(By.cssSelector("#user-name"));
						username.sendKeys("standard_user");
						
						WebElement password=driver.findElement(By.cssSelector("#password"));
						password.sendKeys("secret_sauce");
						
						WebElement loginBtn=driver.findElement(By.cssSelector("#login-button"));
						loginBtn.click();
						/*driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user"); 
						driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
						driver.findElement(By.cssSelector("#logic-button")).click();*/
						Thread.sleep(5000);
						driver.quit();
			}
		}