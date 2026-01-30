package java_OOPs;

public class person {
	String name = "parentname";

}
class Student extends person{
	String name="Student name";
	void printname() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.printname();
	}
}
