package encapsulation;

class amazon_Email_id1{
	
	private String Email_id1 = "amazonclient@gmail.com" ;
	

public String getEmail_id1() {
		return Email_id1;
	}


	public void setEmail_id1(String email_id1) {
		Email_id1 = email_id1;
	}
}

public class Encapsulation_autogenerated {

	public static void main(String[] args) {
		amazon_Email_id1 a1=new amazon_Email_id1();
		a1.setEmail_id1("jyo@gmail.com");
		System.out.println(a1.getEmail_id1());
		

	}

}