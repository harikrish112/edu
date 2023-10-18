package org.edu;

import java.util.Scanner;

public class UppercaseAndLowercaseCount {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String nextLine = sc.nextLine();
	        sc.close();

	        int upperCaseCount = 0;
	        int lowerCaseCount = 0;

	        for (int i = 0; i < nextLine.length(); i++) {
	            char character = nextLine.charAt(i);
	            if (Character.isUpperCase(character)) {
	                upperCaseCount++;
	            } else if (Character.isLowerCase(character)) {
	                lowerCaseCount++;
	            }
	        }

	        System.out.println("Output:");
	        System.out.println("Uppercase Count: " + upperCaseCount);
	        System.out.println("Lowercase Count: " + lowerCaseCount);
	    }
	}