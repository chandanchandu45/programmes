package com.te.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Alist {
 public static void main(String[] args) {
	LinkedList a=new LinkedList();
	a.add(new Employee(101, "chandu", 45000.0));
	a.add(new Employee(105, "sam", 25000));
	a.add(new Employee(100, "mc", 10000));
	Collections.sort(a,new SortBySalary());
	for(Object o:a)
	{
		System.out.println(o);
	}
}


}
