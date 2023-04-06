package lecture27;

public class Person1 {
	private String name="kriti";
	private int age=89;
	
	//Constructor
	public Person1() {
		
	}
	
	
	public Person1(String name,int age) {
	this.name=name;
		this.age=age;
	}
	
	public void fun() {
		String name="Panchi";
		int Aadhar_no=901928;
		System.out.println(this.name+" "+this.age+" "+ Aadhar_no);
	}

	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
