package practice;

public class sort {
	public static void main(String[] args) {
		int[] a = { 5, 3, 1, 8, 98, 56, 45, 25 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[0]);
	}
}