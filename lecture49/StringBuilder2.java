package lecture49;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb=new StringBuilder("Hello"); //changes capacity to 16+Hello
//		System.out.println(sb.capacity());
		//StringPrint();
		StringBuilderPrint();
		
	}

	public static void StringPrint() {
		String s="";
		for(int i=0;i<100000;i++) {
			s=s+i;
		}
		System.out.println(s);
	}
	
	public static void StringBuilderPrint() {
		StringBuilder ss=new StringBuilder();
		for(int i=0;i<100000;i++) {
			ss.append(i);
		}
		System.out.println(ss);
	}
}
