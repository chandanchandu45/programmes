package collection;

import java.util.Vector;
import java.util.Collections;

public class vector {
	public static void main(String[] args) {
		Vector v = new Vector(4);
		v.add(10);
		v.add(5);
		v.add(7);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add("chandu");
		v.add(null);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
