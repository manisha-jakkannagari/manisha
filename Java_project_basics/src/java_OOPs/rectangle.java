package java_OOPs;
import java.util.Scanner;

public class rectangle {
int a,b;
void get() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a:");
	a=sc.nextInt();
	System.out.println("enter b:");
	b=sc.nextInt();
	
}
}
class Area extends rectangle {
	void display() {
		System.out.println("sum:"+(a+b));
		
	}
	public static void main(String [] args) {
		Area a=new Area();
		a.get();
		a.display();
	}
	
}
