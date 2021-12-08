package com.te.comparator;

import java.util.ArrayList;
import java.util.Collections;

import tostring.student;

public class list {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(new Student(1, "chandu", 95));
		a.add(new Student(3, "sam", 65));
		a.add(new Student(2, "mc", 80));
		Collections.sort(a, new SortByName());
		System.out.println("usn\tname\tmarks");
		for (int i = 0; i < a.size(); i++) {
			Object ob = a.get(i);
			Student st = (Student) ob;
			System.out.println(st.usn + "\t" + st.name + "\t" + st.marks);
		}
	}

}
