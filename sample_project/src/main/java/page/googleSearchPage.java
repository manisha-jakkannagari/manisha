package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchPage {
	private static WebElement element=null;
	public static WebElement Search(WebDriver driver) {
		element =driver.findElement(By.name("q"));
		return element;
	}

}

