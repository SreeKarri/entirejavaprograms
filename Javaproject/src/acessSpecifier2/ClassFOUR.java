package acessSpecifier2;

import acessSpecifier.ClassONE;

public class ClassFOUR {   //Outside Package & no SubCla

	public static void main(String[] args) {
		ClassONE c=new ClassONE(); //not able to access any only access Public
		c.pub();

	}

}
