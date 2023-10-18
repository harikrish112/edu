package org.edu;

import java.util.ArrayList;

public class LastIndexValue {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	
	 list.add(10);
     list.add(20);
     list.add(30);
     list.add(90);
     list.add(10);
     list.add(10);
     list.add(40);
     list.add(50);
     
	int lastIndexOf = list.lastIndexOf(10);
	
	if(lastIndexOf != -1) {
		System.out.println("the last index of 10 is :" +lastIndexOf);
	}else {
		System.out.println("no index detected");
	}
}
}
