package first_code_selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class sample6 {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://demo.guru99.com/test/radio.html");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//label[text()='yes']")).click();
						driver.findElement(By.xpath("//label[text()='impressive']")).click();
						boolean status=driver.findElement(By.id("yesRadio")).isSelected();
						System.out.println(status);
			}
}
