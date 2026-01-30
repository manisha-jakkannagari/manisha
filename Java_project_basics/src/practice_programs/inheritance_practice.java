package practice_programs;
import java.util.Scanner;
public class inheritance_practice {
/*int id;
String name;
void getEmp(Scanner sc) {
	System.out.println("enter id:");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter name:");
	name=sc.nextLine();
}
}
class child extends inheritance_practice{
	int total;
	void getsalary(Scanner sc) {
		System.out.println("total");
		total=sc.nextInt();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		child c= new child();
		c.getEmp(sc);
		c.getsalary(sc);
		
	}*/
	
	
	
	
	
	/*String name;
	void setName(String n) {
		name=n;
	}
}
class student extends inheritance_practice{
	int roll;
	void setroll(int r) {
		roll=r;
	}
}
class result extends student{
	int marks;
	void display() {
		System.out.println("name;"+name);
		System.out.println("rollno"+roll);
		System.out.println("marks"+marks);
	}
	public static void main(String[] args) {
		result r= new result();
		r.setName("manisha");
		r.setroll(101);
		r.marks=66;
		r.display();
	}*/
	
	
	
	int speed = 50;
	void show() {
		System.out.println("speed:"+speed);
	}
}
	class child extends inheritance_practice{
		int speed=10;
	void display() {
		System.out.println("speed:"+speed);
		super.show();
	}
	public static void main(String[] args) {
		child c=new child();
		c.display();
	}
	}
	


