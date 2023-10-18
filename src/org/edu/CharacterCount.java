package org.edu;

public class CharacterCount {
public static void main(String[] args) {
	
	String s1 = "welcome back MR.06 @AT YOU****";
	int smallCount=0;
	int capCount = 0;
	int numCount = 0;
	int spclCount = 0;
	
	for(int i =0; i<s1.length();i++) {
		char character = s1.charAt(i);
		if(Character.isUpperCase(character)) {
			capCount++;
			
		}else if(Character.isLowerCase(character)) {
			smallCount++;
		}else if(Character.isDigit(character)) {
			numCount++;
		}else {
			spclCount++;
		}
	}
	System.out.println("smallcount is :"+smallCount);
	System.out.println("capCount is :"+ capCount);
	System.out.println("numcount is:"+ numCount++);
	System.out.println("spclcount is :"+ spclCount);
}
}
