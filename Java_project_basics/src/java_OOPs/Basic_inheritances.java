package java_OOPs;

public class Basic_inheritances{
	void eat() {
		System.out.println("eating");
	}
}

class Dogs extends Basic_inheritances{
	void bark() {
		System.out.println("barking");
	}


public static void main(String[] args) {
	Dogs d=new Dogs();
	d.eat();
	d.bark();
}

}
