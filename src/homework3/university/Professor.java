package homework3.university;

public class Professor {
	private int age;
	private String name;
	private String phonenumber;
	private String email;
	
	
	
	@Override
	public String toString() {
		return "교수 [ 나이 = " + age + "이름 =" + name + ",핸드폰 번호 =" + phonenumber + ",이메일 =" + email + "]";
	}
	
	
	
}
