package first_code_selinium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.chrome.ChromeDriver;
			public class sample4 {
				public static void main(String[] args) throws InterruptedException {
							System.out.println("welcome to home");
							WebDriver driver=new ChromeDriver();
						 	driver.manage().window().maximize();
							driver.get("https://www.google.com");
							Thread.sleep(3000);
							driver.findElement(By.linkText("Gmail"));
							driver.navigate().back();
							Thread.sleep(3000);
							driver.close();
}
 }