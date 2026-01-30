package Test_NG;
import org.testng.annotations.Test;
public class first_code {
	@Test(priority=2)
	private void display() {
		System.out.println("hello");
		
	}
	@Test(priority=1)
	void login() {
		System.out.println("login");
	}
	

}
