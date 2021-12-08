package collection;

import java.util.Iterator;

public class Amain {
	public static void main(String[] args) {
		ArrayList l = new ArrayList(2);
		l.add(10);
		l.add(20);
		l.add(30);
		Object o=l.get(1);
		System.out.println(o);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
