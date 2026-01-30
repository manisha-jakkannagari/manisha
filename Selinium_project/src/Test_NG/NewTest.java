package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("first test case");
  }
  @Test
  public void f1() {
	  System.out.println("second test case");
  }
  @Test
  public void f2() {
	  System.out.println("third test case");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("befor test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
