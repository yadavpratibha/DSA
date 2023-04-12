package lecture29;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Case1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();

		// Case2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C) (obj)).d);
//		System.out.println(((C) (obj)).d2);
//		@Override
//		obj.fun();  //fun(C) overrides fun(P)
//		obj.fun1();
//		((C)(obj)).fun();  //type casting method to C type
//		((C)(obj)).fun2();

		//Case3
//		C obj= new P();
//		System.out.println(obj.d);  //C
//		System.out.println(obj.d1);  //P
//		System.out.println(obj.d2);  //C
//		obj.fun();
		
		//Case4
		C obj=new C();
		System.out.println(obj.d);  //C
		System.out.println(obj.d1);  //P
		System.err.println(obj.d2);  //C
		System.out.println(((P)(obj)).d);  //type casting to P type
		obj.fun();
		obj.fun1();
		obj.fun2();
		
	}

}
