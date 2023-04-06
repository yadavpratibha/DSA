public class Student {
	String name; // data member
	int age;

	public void Intro_yourself() {
		System.out.println( "My name is " + this.name + " and age is " + age);
	}
	
	public void SayHey(String name) {
		System.out.println(name+" Say Hey "+this.name);
	}
	
	public static void fun(int x) {
		System.out.println("I am in fun "+x);
	}
	
	
	static {
		System.out.println("Welcome!!");
	}
}
