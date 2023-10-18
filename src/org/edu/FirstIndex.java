package org.edu;

import java.awt.List;
import java.util.ArrayList;

public class FirstIndex {
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	
	int indexOf = list.lastIndexOf(300);
	System.out.println(indexOf);
}
}
