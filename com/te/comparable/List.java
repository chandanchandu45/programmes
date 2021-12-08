package com.te.comparable;

import java.util.Collections;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		l.add(new Employee(102, "chandu", 45000));
		l.add(new Employee(105, "sam", 25000));
		l.add(new Employee(103, "mc", 35000));
		l.add(new Employee(101, "dboss", 15000));
		Collections.sort(l);
		System.out.println("id\tname\tsalary");
		for (int i = 0; i < l.size(); i++) {
			Object ob = l.get(i);
			Employee emp = (Employee) ob;
			System.out.println(emp.id + "\t" + emp.name + "\t" + emp.sal);
		}
	}
}
