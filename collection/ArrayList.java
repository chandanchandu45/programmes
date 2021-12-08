package collection;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {
	Object[] array;
	int pos;

	public ArrayList(int size) {
		array = new Object[size];
	}

	public void add(Object ob) {
		if (pos >= array.length) {
			grow();
		}
		array[pos] = ob;
		pos++;
	}

	private void grow() {
		Object[] temp = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];
	}

	public void remove(int index) {
		for (int i = index; i <pos; i++) {
			array[i] = array[i + 1];
		}
		pos--;
	}

	@Override
	public String toString() {
		String s = "[" + array[0];
		for (int i = 1; i < pos; i++) {
			s += "," + array[i];
		}
		s += "]";
		return s;
	}
	public Iterator iterator()
	{
		return new myitr();
	}
	class myitr implements Iterator
	{
		int index;
		@Override
		public boolean hasNext() {
			return (index<pos)?true:false;
		}

		@Override
		public Object next() {
			return array[index++];
		}
		
	}
}
