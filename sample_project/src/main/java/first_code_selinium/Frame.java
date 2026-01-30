package first_code_selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class Frame {
			public static void main(String[] args) throws InterruptedException {
						System.out.println("welcome to home");
						WebDriver driver=new ChromeDriver();
					 	driver.manage().window().maximize();
						driver.get("https://the-internet.herokuapp.com/nested_frames");
						driver.switchTo().frame("frame-bottom");
						WebElement a=driver.findElement(By.cssSelector("body"));
						System.out.println("bottom frame text: "+a.getText());
						driver.switchTo().parentFrame();
						driver.switchTo().frame("frame-top");
						driver.switchTo().frame(1);
						Thread.sleep(3000);
						driver.quit();
			}
			

}
