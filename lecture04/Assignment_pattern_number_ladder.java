package lecture04;
import java.util.*;
public class Assignment_pattern_number_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int num=1;
        while(row<=n) {

            
            //for triangle
            int i=1;
            while(i<=row) {

                    System.out.print(num+" ");
                    num++;
                i++;
            }
            
            row++;
            System.out.println();

        }
    }
}
