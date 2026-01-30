package first_code_selinium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class alert {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://demo.guru99.com/test/delete_customer.php");
						driver.findElement(By.name("submit")).click();
						Alert alert=driver.switchTo().alert();
						System.out.println(alert.getText());
						alert.accept();
						Alert alert1=driver.switchTo().alert();
						alert1.dismiss();
						Thread.sleep(3000);
						driver.quit();
						
			}

}
