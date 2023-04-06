package lecture27;

public class StudentLive {
	private String name="kriti";
	private int age=89;
	
	public StudentLive(String name,int age) {
		this.age=age;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws Exception {
		if(age<0) {
			throw new Exception("Age cannot be negative.");
		}
	}
	
//	public void setAge(int age) {
//		try {
//			if(age<0) {
//				throw new Exception("Age is -ve");
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			}
//		finally {
//			System.out.println(getAge());
//		}
//	}
	
}
