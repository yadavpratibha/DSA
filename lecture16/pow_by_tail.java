package lecture16;

public class pow_by_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=4;
		System.out.println(pow(n,m,1));
	}
	public static int pow(int n,int m,int ans) {
		if(m==0) {
			return ans;
		}
		
		return pow(n,m-1,n*ans);
	}

}
