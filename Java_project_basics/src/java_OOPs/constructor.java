package java_OOPs;

public class constructor{
constructor(){
	System.out.println("A");
}
}
class Child extends constructor{
	Child(){
		System.out.println("chikd");
	}
	public static void main(String args[]) {
		Child c=new Child();
	}
}

