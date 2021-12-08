package com.te.comparator;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	public int compare(Employee a, Employee b) {
		return (int)(a.salary-b.salary);
	}}
