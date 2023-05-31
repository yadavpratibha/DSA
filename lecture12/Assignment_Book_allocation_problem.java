package lecture12;
import java.util.*;
public class Assignment_Book_allocation_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //number of test cases
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt(); //number of books
			int m = sc.nextInt(); //number of students
			int[] books = new int[n];
			for(int j=0;j<books.length;j++) { //pages in books
				books[j] = sc.nextInt();
			}
			int[] pages = new int[books.length+1];
			pages[0] = 0;//array of pages
			for(int k=1;k<pages.length;k++) {
				pages[i]=pages[i-1]+books[i-1];
			}
			System.out.print(Min_pages(books,pages,m));
		}
	}
	public static int Min_pages(int[] books, int[] pages, int m) {
		int low=0;
		int high=pages[pages.length-1];
		int ans=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if((isitpossible(books,pages,mid,m))==true) {
				ans=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] books,int[] pages, int mid, int m) {
		int count=1;
		int pages_read=0;
		for(int i=0;i<books.length;i++) {
			if(pages[i]<=mid) {
				
				count++;
				
			}
			if(count>m) {
				return false;
			}
		}
		return true;
	}

}
