package acessSpecifier;

public class ClassONE {
	 public static void pub() {
		  
		System.out.println("Public");
	}
	private static void pri() {
		System.out.println("Private");
	}
	protected static void pro() {
		System.out.println("Protected");
	}
	  static void def() {
		 System.out.println("default"); 
	  }
	


public static void main(String[]args) {
	pub();
	 pri();
	 pro();
	 def();
}	
}
