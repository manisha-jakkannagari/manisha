package java_OOPs;

public class this_keyword {
	int id;//instance variable
	String name;
	//constructor
	this_keyword(int id,String name){
		this.id=id;//local variable
		this.name=name;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
	}
	
	public static void main(String[] args) {
		this_keyword t= new this_keyword(101,"manisha");
		t.display();
	}

}
