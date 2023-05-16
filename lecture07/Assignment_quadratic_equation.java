package lecture07;
import java.util.*;
public class Assignment_quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (b*b)-(4*a*c);
		int d1 = (int)((-b-Math.sqrt(d))/(2*a));
		int d2 = (int)((-b+Math.sqrt(d))/(2*a));
	    if(d < 0){
            System.out.println("Imaginary");
            return;
        }
        if(d == 0){
        System.out.println("Real and Equal");
        }
        else if(d >0){
            System.out.println("Real and Distinct");
        }
        System.out.println(d1+" "+d2);
	}

}