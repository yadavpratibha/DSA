package lecture07;
import java.util.*;
public class Assignment_lower_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int i = (int)(a);
		if(a>=65 && a<=90) {
			System.out.print("UPPERCASE");
		}
		else if(a>=91 && a<=117){
			System.out.print("lowercase");
		}
		else {
			System.out.print("Invalid");
		}
		
	}

}
