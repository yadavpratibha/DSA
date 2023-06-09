package lecture12;
import java.util.*;
public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n=sc.nextInt();
		System.out.println(root(k,n));
	}
	public static int root(int k,int n) {
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if((Math.pow(mid, k))<=n) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;	
		}
	}

