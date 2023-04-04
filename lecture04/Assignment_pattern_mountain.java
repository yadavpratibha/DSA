package lecture04;
import java.util.*;
public class Assignment_pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star = 1;
        int space = 2*n-3;
        int val=1;
        while(row<=n) {

            //print left numbers
            int i=1;
            val=1;
            while(i<=star) {
                System.out.print(val+" ");
                i++;
                val++;
            }

            //print space
            int j=1;
            while(j<=space) {
                System.out.print("  ");
                j++;
            }

            //print number
            int k=1;
            val=row;
            if (row==n) {
                k=2;
                val=row-1;
            }
            while(k<=star) {
                System.out.print(val+" ");
                k++;
                val--;
            }
            
            row++;
            star++;
            space-=2;
            System.out.println();
        }
    }
}