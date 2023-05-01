package lecture01;
public class Print_table_of_7_but_not_divisible_by_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			int p = 7*i;
			if (p%4!=0) {
				System.out.println(p);
			}
			
			i++;
		}
	}

}
