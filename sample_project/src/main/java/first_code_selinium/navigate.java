package first_code_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
		public class navigate {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
					 	driver.get("https://www.google.com");
					 	Thread.sleep(2000);
					 	driver.navigate().to("https://www.youtube.com");
					 	Thread.sleep(2000);
					 	driver.navigate().back();
					 	Thread.sleep(2000);
					 	driver.navigate().forward();
					 	Thread.sleep(2000);
					 	driver.navigate().refresh();
					 	driver.quit();
					 	
			}
		}