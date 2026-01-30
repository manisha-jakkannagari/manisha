package java_OOPs;

public class super_class {
	void get() {
		System.out.println("suoer class method");
	}

}
class sub_class extends super_class{
	void dispaly() {
		System.out.println("sub class method");
		super.get();//get the method from parent without calling parent class
	}
	public static void main(String[] args) {
		sub_class d=new sub_class();
		d.dispaly();
	}
	
}
