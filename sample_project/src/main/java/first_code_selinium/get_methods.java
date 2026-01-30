package first_code_selinium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class get_methods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=cms/demo");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String windowid=driver.getWindowHandle();
	System.out.println("windowid:"+windowid);
	
}
}
