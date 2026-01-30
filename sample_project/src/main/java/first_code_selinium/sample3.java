package first_code_selinium;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class sample3 {
		public static void main(String[] args) throws InterruptedException {
					System.out.println("welcome to home");
					WebDriver driver=new ChromeDriver();
				 	driver.manage().window().maximize();
					driver.get("https://www.saucedemo.com");
					Thread.sleep(3000);
					WebElement sb=driver.findElement(By.id("q"));
					sb.sendKeys("India");
					sb.sendKeys(Keys.ENTER);
					String actualurl=driver.getCurrentUrl();
					System.out.println(actualurl);

		}
	}
