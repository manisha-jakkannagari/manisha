package java_OOPs;

public class multi_inheritance {
void land() {
	System.out.println("Grandparents own land");
}
}
class parent extends multi_inheritance{
	void house(){
		System.out.println("Parents owns house");
	}
}
class child extends parent{
	String bike() {
		System.out.println("child owns ");
		return "Bike";
	}
	public static void main(String[] args) {
		child c=new child();
		c.land();
		c.house();
		c.bike();
	}
}
