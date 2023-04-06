package lecture27;

public class StudentLive_Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		StudentLive s=new StudentLive("Rajma",23);
		s.setName("Kumar");
		
		s.setAge(-22);
		System.out.println(s.getAge()+" "+s.getName());
	}

}
