package encapsulation;

class amazon_Email_id{
	private String Email_id  ="amazonclient@gmail.com" ;
		

	public String getEmail_id() {
		return Email_id;
		
}
	public void setEmail_id(String Email_id) {
		this.Email_id=Email_id;
		
	}
	
}

public class Getter_Setter_UPdateEmail_ID {
	
	
	
	

	public static void main(String[] args) {
		
		amazon_Email_id a=new amazon_Email_id();
		a.setEmail_id("Jyokarri@gmail.com");
		System.out.println(a.getEmail_id());

	}

}
