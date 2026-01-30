package java_OOPs;

interface vehicles {
void start();
void stop();
}
class Car implements vehicles{
	public void start() {
		System.out.println("bike is staring");
	}
	public void stop() {
		System.out.println("bike stops");
	}
	public static void main(String [] args) {
		vehicles v=new Car();
		v.start();
		v.stop();
	}
}