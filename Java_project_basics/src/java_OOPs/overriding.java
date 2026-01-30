package java_OOPs;

public class overriding {
	void run() {
		System.out.println("vehicle is running");
	}

}
class Bike extends overriding{
	void run() {
		System.out.println("bike is safely running");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
	}
}
