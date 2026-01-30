package practice_programs;

//public interface interface_practice {
/*void getRateOfIntrest();
}
class Sbi implements interface_practice{
	public void getRateOfIntrest() {
		System.out.println("sbi rate of intrest 7%");
	}
}
class hdfc implements interface_practice{
	public void getRateOfIntrest() {
		System.out.println("hdfc ratee of intrest 4%");
	}
	public static void main(String[] args) {
		interface_practice i;
		i=new Sbi();
		i.getRateOfIntrest();
		i=new hdfc();
		i.getRateOfIntrest();
	}*/
	
//}



/*interface printable{
	void show();
	void display();
}
class demo implements printable{
	public void show() {
		System.out.println("show fxn");
	}
}
class demos implements printable{
	public void display() {
		System.out.println("display fxn");
	}
	public static void main(String[] args) {
		printable p;
		p=new demo();
		p.show();
		p=new demos();
		p.display();
	}
}*/


/*interface vehicle{
	void speed();
	default void fuel() {
		System.out.println("vehicle uses fuel");
	}
}
class Bike implements vehicle{
	public void speed() {
		System.out.println("speed of vehicle is 60km");
	}
	public static void main(String [] args) {
		vehicle v;
		v=new Bike();
		v.speed();
		v.fuel();
		
	}
}*/


/*interface MathOperations{
	static void display(int a,int b) {
		System.out.println("sum"+(a+b));
	}
	public static void main(String[] args) {
		MathOperations.display(10,20);
	}
}*/


interface Calculation{
	void add(int a, int b);
}
class Lambda{
	public static void main(String[] args) {
		Calculation c=(a,b)->(a+b);
		System.out.println("add:"+c.add(10,20));
	}
}


