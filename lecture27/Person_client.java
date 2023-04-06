package lecture27;

public class Person_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor
		//Memory allocation
		//Parsing
		
		Person p = new Person("Karan",25);
		p.name="Kaju";
		p.age=23;
		p.fun(); 
		
		Person p1=new Person("Kumar",24);
		p1.name="Kunal";
		p1.age=45;
		p1.fun();
		
		Person p2 = new Person("Karan",25);
		p2.fun(); 
	}
	
}
