package org.edu;

public class StringIdentityHashCode {

	 public static void main(String[] args) {
		
		 String s1 = "hari";
		 String s2 = "hari";
		 
		 int identityHashCode = System.identityHashCode(s1);
		 int identityHashCode2 = System.identityHashCode(s2);
		 
		 System.out.println("string1:" + s1);
		 System.out.println("the hashcode for s1" + identityHashCode);
		 System.out.println("string2:" + s2);
		 System.out.println("the hashcode for s2" + identityHashCode2);
		 
		 boolean areEqual = (identityHashCode ==identityHashCode2);
		 System.out.println("output:"+areEqual);
	}
}
