package Java_learning_ilp;
import java.util.Scanner;
public class recurtion {
static int fact(int n) {
	if(n==0)
		return 1;
	else
		return n*fact(n-1);
	
	
}
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("Factorial:"+fact(num));
	
}
}
