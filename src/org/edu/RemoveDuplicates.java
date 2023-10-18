package org.edu;

import java.util.ArrayList;

public class RemoveDuplicates {
public static void main(String[] args) {
	int   a[]= {10,10,20,50,60,80,60,50};
	ArrayList<Integer> un = new ArrayList<>();
	
	for(int elements : a) {
		if(!un.contains(elements)) {
			un.add(elements);
			
		}
	}
	System.out.println(un);
}
}
