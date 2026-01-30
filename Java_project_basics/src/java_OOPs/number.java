package java_OOPs;
import java.util.Scanner;

public class number {
	int n;

}
class square extends number{
	void calculate() {
		System.out.println("square"+n*n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		square s= new square();
		s.n = sc.nextInt() ;
		s.calculate();
		
	}
}
