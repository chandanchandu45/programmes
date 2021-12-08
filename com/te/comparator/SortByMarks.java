package com.te.comparator;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return (int) (s2.marks - s1.marks);
	}

}
