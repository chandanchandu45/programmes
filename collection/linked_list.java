package collection;

import java.util.Collections;
import java.util.LinkedList;

public class linked_list implements Comparable<linked_list> {
	int id;
	String name;
	double salary;

	linked_list(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int compareTo(linked_list l) {
		return  (this.id - l.id);
	}

	/*
	 * public int compareTo(Object ob) { linked_list li=(linked_list)ob; return
	 * (int) (this.salary-li.salary); }
	 */
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(new linked_list(105, "chandu", 45000));
		l.add(new linked_list(102, "sam", 30000));
		l.add(new linked_list(103, "mcc", 20000));
		Collections.sort(l);
		System.out.println("id\tname\tsalary");
		for (int i = 0; i < l.size(); i++) {
			Object ob = l.get(i);
			linked_list li = (linked_list) ob;
			System.out.println(li.id + "\t" + li.name + "\t" + li.salary);
		}
	}
}