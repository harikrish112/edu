package org.edu;

public class Fibanocciseries {
	
	public static void main(String[] args) {
		int limit = 100;
		
		
		System.out.println("fibanocci series up to "+limit+" ");
		int num1 = 0, num2 = 1;
		
		while(num1 <= limit) {
			System.out.print(num1 +" ");
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
			
		}
		
	}

}
