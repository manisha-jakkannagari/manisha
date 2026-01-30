package java_OOPs;
import java.util.Scanner;


public class inheritace {
	int a,b;
	void parent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		a =sc.nextInt();
		System.out.println("enter b:");
		b=sc.nextInt();
	
		
	}
	

}
class Child extends inheritace{
	void child() {
		System.out.println("sum="+(a+b));
	}
public static void main(String[] args) {
	Child c=new Child();
	c.parent();
	c.child();
}
	
}