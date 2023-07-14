package lecture26;

import java.util.Scanner;

public class Leetcode204_Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(CountPrime(n));
	}
	
	public static int CountPrime(int n) {
        int count=0;
        boolean[] prime=new boolean[n];

        for(int i=2;i*i<=prime.length;i++) {
            if(prime[i]==false) {
                for(int j=2;j*i<prime.length;j++) {
                    prime[i*j]=true;
                }
            }
        }

        for(int i=2;i<prime.length;i++) {
            if(prime[i]==false) {
                count++;
            }
        }
        return count;
    }

}
