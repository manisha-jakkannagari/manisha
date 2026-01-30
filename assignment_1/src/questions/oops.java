package questions;

public class oops {
	double salary;
	String designation;
	
	//constructor
    oops(String designation,double salary){
	this.salary=salary;
	this.designation=designation;
	
}

double calculateSalary() {//method overriding
	return salary;
}
}

//child class1
class manager extends oops{
	manager(String designation,double salary){
		super(salary,designation);//calling parent variables
	}
	//overriding
	double calculateSalary() {
		return salary+(salary*0.70);
	}
}
//child class2
class developer extends oops{
	developer(String designation,double salary){
		super(designation,salary);
	}
	double calculateSalary() {
		return salary+(salary*0.50);
	}
}
//child class3
class tester extends oops{
	tester(String designation,double salary){
		super(designation,salary);
	}
	double calculateSalary() {
		return salary+(salary*0.30);
	}

	public static void main(String[] args) {
		oops o1=new manager("manager",50000);//childclass1 object creation
		oops o2=new developer("developer",30000);
		oops o3=new tester("tester",20000);
		System.out.println("manager salary:"+o1.calculateSalary());//calling method
		System.out.println("devoloper salary"+o2.calculateSalary());
		System.out.println("tester salary"+o3.calculateSalary());
	}
	
}


