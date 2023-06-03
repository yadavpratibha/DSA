package lecture12;
import java.util.*;
public class Assignment_Conversion_any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int source = sc.nextInt();
		int destination = sc.nextInt();
		int number = sc.nextInt();
		System.out.print(Convert(source,destination,number));
	}
	
	public static int Convert(int src,int dstn,int num) {
		//source to decimal
		int sum=0;
		int mul=1;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem*mul;
			num=num/10;
			mul=mul*src;
		}
		
		//decimal to destination
		int sumf=0;
		mul=1;
		while(sum!=0) {
			int rem=sum%dstn;
			sumf=sumf+rem*mul;
			sum=sum/dstn;
			mul=mul*10;
		}
		
		return sumf;
	}

}
