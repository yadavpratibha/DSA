package lecture04;
import java.util.*;
public class Assignment_pattern_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star =1;
        int space=n-1;
        int val=1;
        while(row<=2*n-1) {
            //print space
            int i=1;
            while(i<=space) {
                System.out.print("\t");
                i++;
            }

            //print star
            int j =1;
            int a=val;
            while(j<=star) {
                System.out.print(a+"\t");
                if(j<=star/2) {
                    a++;
                    }
                else {
                    a--;
                }
                j++;
            }

            //mirroring
            if(row<n) {
                space--;
                star+=2;
                val++;
            }
            else {
                space++;
                star-=2;
                val--;
            }

            row++;
            System.out.println();
        }
    }
}