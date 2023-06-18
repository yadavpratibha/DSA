package lecture14;

public class Compare_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sumit";
		String s2 = "suman";
		compare_string(s1,s2);
		if(compare_string(s1,s2)>0) {
			System.out.println(s1);
		}
		else {
			System.out.println(s2);
		}
		System.out.println();
		System.out.println(s1.compareTo(s2));
		
	}
	//if -ve return s2
	//if +ve return s1
	public static int compare_string(String s1,String s2) {
		int len = Math.min(s1.length(), s2.length());
		for(int i=0;i<len;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.charAt(len)-s2.length();
	}

}
