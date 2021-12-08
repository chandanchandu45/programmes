package com.te.set;

public class Student {
	int usn;
	String name;
	double marks;

	public Student(int usn, String name, double marks) {
		this.usn = usn;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return usn;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.usn == other.usn;
	}
}
