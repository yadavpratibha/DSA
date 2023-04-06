package lecture27;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		String name="Riya"; //local variable
		s.name="Kaju";
		s.age=20;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourself();
		System.out.println();
		
		Student s1 = new Student();
		s1.name="Raj";
		s1.age=25;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.Intro_yourself();
		s1.SayHey(name);
		
		Student.fun(100);
	}

}
