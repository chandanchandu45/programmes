package com.te.comparator;

import java.util.Comparator;

public class SortByusn implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.usn-s2.usn;
	}

}
