package com.te.comparable;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}


}
