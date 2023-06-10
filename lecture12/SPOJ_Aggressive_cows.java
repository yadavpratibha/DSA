package lecture12;
import java.util.*;


public class SPOJ_Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //number of testcase
		for(int j=1;j<=t;j++) {
		int n = sc.nextInt(); //number of stalls
		int noc = sc.nextInt(); //number of cows to be laced
		int[] stall = new int[n];
		for(int i=0;i<stall.length;i++) {
			stall[i] = sc.nextInt(); //position of stalls presented in an array
		}
		Arrays.sort(stall); //bubble sort library
		System.out.println(largest_minimum_distance(stall,noc));
		}
	}
	public static int largest_minimum_distance(int[] stall, int noc) {
		int lo=stall[0]; //first cow
		int hi= stall[stall.length-1]-stall[0]; //last cow wrt first
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(stall,noc,mid)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int[] stall,int noc, int mid) {
		int c=1; //put first cow at stall[0]
		int pos=stall[0];
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) { //distance between C2-C1 >= distance calculated in previous function
				c++; //if condition is satisfied cow will be placed(Number of cow placed increases)
				pos=stall[i]; //preparation for finding position of next cow
			}
			if(c==noc) { //if 3 cows are successfully placed then true
				return true;
			}
		}
		return false;
	}

}
