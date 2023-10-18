package org.edu;

import java.util.Scanner;

public class SplitBySpace {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String nextLine = sc.nextLine();
	sc.close();
	
	String[] split = nextLine.split(" ");
	
	System.out.println("output");
	for(String splits : split) {
		System.out.println(splits);
	}
	
}
}
