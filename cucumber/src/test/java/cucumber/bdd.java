package cucumber;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class bdd {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//	    throw new io.cucumber.java.PendingException();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://www.google.com");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user entered a text in search box")
	public void user_entered_a_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.quit();
	    //throw new io.cucumber.java.PendingException();
	}



}
	


