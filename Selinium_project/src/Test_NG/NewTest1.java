package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
  @Test(groups = {"manisha"})
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }

}
