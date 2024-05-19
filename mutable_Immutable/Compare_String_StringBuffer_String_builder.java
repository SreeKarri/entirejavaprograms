package mutable_Immutable;

public class Compare_String_StringBuffer_String_builder {

	public static void main(String[] args) {
		String s="welcome";//String
		s.concat("to java");
		System.out.println(s);
		
		StringBuffer s1=new StringBuffer("welcome");
		s1.append(" to java");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("welcome");
		s2.append(" to java");
		System.out.println(s2);
		
		
           
	}

}
