package org.edu;

public class VowelsCount {
public static void main(String[] args) {
	
	String s1 = "welcome to java";
	String lowerCase = s1.toLowerCase();
	int vowelsCount=0;
	int consonentCount =0;
	
	for(int i = 0; i<s1.length();i++) {
	   char character = s1.charAt(i);
	if(character >= 'a' && character <= 'z') {
		if(character == 'a' || character =='e'||character =='i'||character=='o'||character=='u') {
			vowelsCount++;
		}else {
			consonentCount++;
			
		}
	}	
	}
	System.out.println("vowels count is:"+ vowelsCount);
System.out.println("consonentcount is:" +consonentCount);
	
}
}