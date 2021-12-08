package com.te.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add(new Student(101, "chandu", 95));
		h.add(new Student(101, "sam", 75));
		h.add(new Student(103, "dboss", 85));
		h.add(new Student(104, "mc", 65));
		ArrayList a = new ArrayList(h);
		Collections.sort(a, new SortByName());
		Iterator<Student> ite = a.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
