package lecture30;

import java.util.*;
import java.util.LinkedList;

public class Assignment_Importance_of_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
LinkedList<Integer>calling=new LinkedList<>();
		LinkedList<Integer> process = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			calling.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			process.add(sc.nextInt());
		}
		System.out.println(time(calling, process));

	}

	public static int time(LinkedList<Integer> calling, LinkedList<Integer> process) {
		int t = 0;
		while (!calling.isEmpty()) {
			if (calling.peek() == process.peek()) {
				calling.remove();
				process.remove();
			} else {
				int ii = calling.remove();
				calling.add(ii);
			}
			t++;
		}
		return t;
	}
}