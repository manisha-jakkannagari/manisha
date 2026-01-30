package Java_learning_ilp;

public class constructor {
/*constructor(){
	System.out.println("calld");
}
public static void main(String [] args) {
	constructor c= new constructor();
}*/
	constructor(int id,String name){
		System.out.println(id+name);
		
	}
	public static void main(String[] args) {
	constructor c1=new constructor(101,"mani");
	constructor c2=new constructor(102,"sai");
	}
}
