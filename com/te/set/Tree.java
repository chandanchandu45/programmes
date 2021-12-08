package com.te.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Tree {
public static void main(String[] args) {
	TreeSet t=new TreeSet<>();
	t.add(20);
	t.add(40);
	t.add(10);
	t.add(30);
	System.out.println(t);
	/*ArrayList a=new ArrayList(t);
	ListIterator listIterator = a.listIterator(a.size());
	while(listIterator.hasPrevious()){
		System.out.println(listIterator.previous());
	}*/
}
}
