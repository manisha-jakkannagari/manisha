package Parallel_testng;
import org.testng.annotations.*;

public class Parallel_1 {
	@Test
	public void f1() {
		System.out.println("One");
	}
     @Test
     public void f2() {
    	 System.out.println("Two");
     }
     @Test
     public void f3() {
    	 System.out.println("Three");
     }
}
