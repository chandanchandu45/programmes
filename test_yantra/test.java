package test_yantra;

public class test {
	static void duplicate() {
		int[] a = { 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6 };
		int[] temp = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[a.length - 1];
		for (int x : temp) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		duplicate();
	}
}
