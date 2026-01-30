package first_code_selinium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		public class dropdown {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("http://demo.guru99.com/test/newtours/register.php");
						
						WebElement cityDropdown=driver.findElement(By.name("country"));
						Select s= new Select(cityDropdown);
						/*List<WebElement> options=s.getOptions();
						for(WebElement option:options) {
							System.out.println(option.getText());
						}
						s.selectByVisibleText("INDIA");
						driver.quit();*/
						s.selectByVisibleText("INDIA");
						Thread.sleep(2000);
						boolean binDisplayed=cityDropdown.isDisplayed();
						boolean binEnabled=cityDropdown.isEnabled();
						Thread.sleep(3000);
						s.selectByValue("Africa");
						Thread.sleep(3000);
						s.selectByIndex(1);
						driver.quit();
						
						
}
		}
		
