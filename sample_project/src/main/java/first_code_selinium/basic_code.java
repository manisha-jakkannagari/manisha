package first_code_selinium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic_code {
	
	public static void main(String[]args) {
		//System.out.println("webdriver.chrome.driver","C:\drivers\\chromedriver.exe);
		System.out.println("hello world");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.google.com");
		String currentURL=driver.getCurrentUrl();
		System.out.println("current url:"+currentURL);
		driver.quit();
	}


}
