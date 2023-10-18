package org.edu;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a non negotiative number");
	int nextInt = sc.nextInt();
	
	if(nextInt < 0) {
		System.out.println("factorial is undefined for negative number ");
	}else {
		long factorial = calculateFactorial(nextInt);
		 System.out.println("Factorial of " + nextInt + " is " + factorial);
	}
	sc.close();
}

private static long calculateFactorial(int nextInt) {
	if(nextInt == 0|| nextInt == 1) {
		return 1;
	}
	long factorial = 1;
	for(int i = 2 ; i<=nextInt;i++) {
		factorial *= i;
	}
	return factorial;
}
}
