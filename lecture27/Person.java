package lecture27;

public class Person {
	String name;
	int age;
	
	//Constructor
//	public Person() {
//		this.name="Motu";
//		this.age=24;
//	}
	
	
	public Person(String name,int age) {
	this.name=name;
		this.age=age;
	}
	
	public void fun() {
		String name="Panchi";
		int Aadhar_no=901928;
		System.out.println(this.name+" "+this.age+" "+ Aadhar_no);
	}
}
