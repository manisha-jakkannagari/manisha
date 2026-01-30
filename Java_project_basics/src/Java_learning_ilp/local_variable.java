package Java_learning_ilp;

public class local_variable {
	void sum() {
		int a=10;
		int b=20;
		System.out.println("sum :"+ (a+b));
	}
	public static void main(String args[]) {
		local_variable l1=new local_variable();
		l1.sum();
	}

}
