package first_code_selinium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class licators1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_action_request\"]"));
		//driver.findElements(By.xpath(""));
		driver.quit();
		
		
	}

}
