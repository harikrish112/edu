package org.edu;

import java.awt.List;
import java.util.ArrayList;

public class EachIndexValue {
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(10);
	list.add(60);
	list.add(10);
	list.add(10);
	list.add(40);
	list.add(30);
	list.add(20);
	list.add(1);
	list.add(100);
	
	int searchValue = 70;
	ArrayList<Integer> li = new ArrayList<>();
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i)== searchValue) {
			li.add(i);
		}
	}
	System.out.println(li);
}
}
