package org.edu;

import java.util.Scanner;

public class ContainsAndChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your gmail");
		String line = sc.nextLine();
		sc.close();
		
		boolean b = line.contains("gmail");
		System.out.println("output:" +b);
		
		String replace = line.toUpperCase().replace("gmail", "yahoo");
		
		System.out.println("output:"+ replace);
		
	}
}
