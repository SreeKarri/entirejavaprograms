package encapsulation;

class Login {
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Getter_Setter_Methods {

	public static void main(String[] args) {

		Login l = new Login();
		l.setAge(25);
		System.out.println(l.getAge());
	}

}
