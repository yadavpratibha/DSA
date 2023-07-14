package lecture26;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		Prime_Sieve(n);
	}
	// boolean is false by default
	//if index is false then prime
	public static void Prime_Sieve(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0]=true; //not a prime number
		prime[1]=true; //not a prime
		
		for(int i=2;i*i<=prime.length;i++) {
			if(prime[i]==false) {
				for(int j=2;j*i<prime.length;j++) {
					prime[j*i]=true; //mark it as not prime
				}
			}
		}
		
		for(int i=0;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
		}
	}

}
