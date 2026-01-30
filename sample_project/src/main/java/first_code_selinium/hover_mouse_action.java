package first_code_selinium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
		public class  hover_mouse_action{
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("http://google.com");
						WebElement register=driver.findElement(By.linkText("Gmail"));
						Actions act=new Actions(driver);
						act.moveToElement(register).perform();
						
			}

}
