package first_code_selinium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
			 
public class sample5 {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://www.google.com");
						Thread.sleep(3000);
						//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testuser");
						driver.findElement(By.linkText("Gmail")).click();
						driver.findElement(By.xpath("//a[@class='gb_Z' and @aria-label='Gmail']")).click();	
}
			}
