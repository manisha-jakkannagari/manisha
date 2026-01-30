package first_code_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
		public class sample9 {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://jqueryui.com/droppable/");
						driver.switchTo().frame(0);
						WebElement source=driver.findElement(By.id("draggable"));
						WebElement target=driver.findElement(By.id("droppable"));
						Actions act=new Actions(driver);
						//act.dragAndDrop(source,target).perform();
						act.clickAndHold(source).moveToElement(target).release().perform();
						//act.dragAndDrop(source, target).sendKeys(Keys.ENTER).build().perform();
			}
		}