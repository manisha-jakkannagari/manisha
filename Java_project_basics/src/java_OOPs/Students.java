package java_OOPs;

 class College {
	private int rollno;
	
	public  void setRollno(int r) {
		rollno = r;
	}
	public int getRollNo() {
		return rollno;
	}
 }
public class Students{
public static void main(String[] args) {
	College coll = new College();
	coll.setRollno(101);
	System.out.println("rollno:"+ coll.getRollNo());
}
}
