package lecture12;

public class Leetcode_278_First_bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int firstBadVersion(int n) {
		int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi) {
        	int mid=lo+(hi-lo)/2;
        	if(isBadVersion(mid)==true) {
        		ans=mid;
        		hi=mid-1;
        	}
        	else {
        		lo=mid+1;
        	}
        }
        return ans; 
    }

	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		//the function is predefined in leetcode which judges whether a version is good or bad
		
		return false;
	}
}
