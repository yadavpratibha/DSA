package lecture18;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int des = 4;
		int curr = 0;
		System.out.println("\n" +PrintPath(curr,des,""));;
	}

	public static int PrintPath(int curr, int des, String ans) {
		if (curr == des) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > des) {
			return 0;
		}

		int a1=PrintPath(curr + 1, des, ans + 1);
		int b1=PrintPath(curr + 2, des, ans + 2);
		int c1=PrintPath(curr + 3, des, ans + 3);
		return a1+b1+c1;
	}

}
