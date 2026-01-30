package java_OOPs;

abstract class college {
	 abstract void my_job();

}
class student extends college{
	void my_job() {
		System.out.println("my job is studying");
	}
}
class professor extends college {
	void my_job() {
		System.out.println("my job is teachoing");
		
	}
}


class abstract_class{
	public static void main(String[] args) {
   college   p= new student();
   college   p1= new professor();
     p.my_job();
     p1.my_job();
		
	}
}
	


